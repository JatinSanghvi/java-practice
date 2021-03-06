// Problem ID: 671. Betting game.
//
// You are involved in a betting game whose rules are as follows :
// a) If you win a round, the bet amount will be added to your current sum and next bet amount will become $1;
// b) If you lose a round, the bet amount will be reduced from your current sum and next bet will become twice the
//    previous.
// c) game ends either when all the rounds are complete or when you don't have sufficient sum.
//
// Initially, you are given with a string consisting of characters from the set {'W', 'L'}, where 'W' indicates a win
// and 'L' indicates a loss, and initial sum is 4. Initial bet amount for the 1st round will be $1. You need to find and
// print the amount at the end of the game (final sum) and in case you do not have enough money in between the game to
// play the next round, then print -1.
//
// Input:
// The first line of input contains an integer T denoting the number of test cases.
// The first line of each test case is a string S made of {W, L}.
//
// Output:
// Print the amount at the end of the game (final sum) and in case you have not enough money in between the game then print -1.
//
// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ Size of string S ≤ 50
//
// Example:
//
// Input:
// 2
// WL
// WLWLLLWWLW
//
// Output:
// 4
// -1

package com.jsanghvi.online_problems.geeksforgeeks.medium;

import java.util.Scanner;

public class P0671_BettingGame {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int T = in.nextInt();

        for (int test = 0; test < T; test++) {
            printFinalAmount(in.next());
        }
    }

    private static void printFinalAmount(final String results) {
        int finalAmount = 4;
        int betAmount = 1;

        for (int i = 0; i < results.length(); i++) {
            if (results.charAt(i) == 'W') {
                finalAmount += betAmount;
                betAmount = 1;
            } else if (results.charAt(i) == 'L') {
                finalAmount -= betAmount;
                betAmount *= 2;
            }

            if (i < results.length() - 1 && finalAmount < betAmount) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(finalAmount);
    }
}
