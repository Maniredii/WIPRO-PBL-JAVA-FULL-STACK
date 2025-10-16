/*
Problem Statement
Simple Encoded Array
Maya has stored a few confidential numbers in an array (array of int). To ensure that others do not find the numbers easily, she has applied a simple encoding.

Encoding Used:
Each array element has been substituted with a value that is the sum of its original value and its succeeding element’s value:

arr[i] = original_value_of_arr[i] + original_value_of_arr[i+1]

The last element value is unchanged.

Example:
If encoded array is [7][8][6][16][12][3], original array would have been [2][5][1][7][9][3].

The first number is 2

Sum of originals: 2 + 5 + 1 + 7 + 9 + 3 = 27

Tasks:
Given the encoded array, write a function to compute:

The first original number

The sum of all numbers in the original array

*/


import java.io.*;
import java.util.*;

class UserMainCode {
    public static class Result {
        public final int out1;
        public final int out2;

        public Result(int out1, int out2) {
            this.out1 = out1;
            this.out2 = out2;
        }
    }

    public Result findOriginalFirstAndSum(int[] input1, int input2) {
        int n = input2;
        int[] original = new int[n];
        // The last element remains the same
        original[n - 1] = input1[n - 1];

        // Reverse direction: original[i] = encoded[i] - original[i+1]
        for (int i = n - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }

        // Compute sum
        int sum = 0;
        for (int num : original) {
            sum += num;
        }

        return new Result(original[0], sum);
    }
}
