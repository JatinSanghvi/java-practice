// Problem ID: 181. Maximize Toys.
//
// Given an array consisting cost of toys. Given an integer K depicting the amount with you. Maximise the number of toys
// you can have with K amount.
//
// Input:
//
// The first line contains an integer T, depicting total number of test cases. Then following T lines contains an
// integer N depicting the number of toys and an integer K depicting the value of K. Next line is followed by the cost
// of toys.
//
// Output:
//
// Print the maximum toys in separate line.
//
// Constraints:
//
// 1 ≤ T ≤ 30
// 1 ≤ N ≤ 1000
// 1 ≤ K ≤ 10000
// 1 ≤ A[i] ≤ 10000
//
// Example:
//
// Input
// 1
// 7 50
// 1 12 5 111 200 1000 10
//
// Output
// 4

package com.jsanghvi.online_problems.geeksforgeeks.easy;

import java.util.Arrays;
import java.util.Scanner;

public class P0181_MaximizeToys {
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        final int T = in.nextInt();

        for (int test = 0; test < T; test++) {
            final int N = in.nextInt();
            final int K = in.nextInt();
            final int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            printMaximumToys(A, K);
        }
    }

    private static void printMaximumToys(final int[] toyCosts, final int amount) {
        Arrays.sort(toyCosts);

        int toys = 0;
        for (int i = 0, remainingAmount = amount; i < toyCosts.length && remainingAmount >= toyCosts[i];
             remainingAmount -= toyCosts[i++]) {
            toys += 1;
        }

        System.out.println(toys);
    }
}
