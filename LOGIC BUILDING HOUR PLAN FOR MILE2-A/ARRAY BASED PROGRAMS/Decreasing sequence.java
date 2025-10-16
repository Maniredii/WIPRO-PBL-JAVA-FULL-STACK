/*
Problem Statement
Decreasing Sequence
Given an integer array, find the number of decreasing sequences in the array and the length of the longest decreasing sequence.

Input:

input1: the integer array

input2: the number of elements in the integer array

Expected output:

out1: the number of decreasing sequences in the array

out2: the length of the longest decreasing sequence

Example 1:
If input1[] = {11, 3, 1, 7, 4, 8, 12, 2, 3}, and input2 = 9:

Out1 (number of decreasing sequences): 2

Out2 (length of longest decreasing sequence): 3

Explanation: sequences are {11, 3, 1} and {12, 2}

Example 2:
If input1[] = {7, 6, 5, 4, 3, 2, 1}, and input2 = 7:

Out1: 1

Out2: 7

Example 3:
If input1[] = {25, 105, 102, 151, 27, 151, 27, 53, 27, 101, 102, 101, 29, 740, 5}, and input2 = 15:

Out1: 8

Out2: 3

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

    public Result decreasingSequence(int[] input1, int input2) {
        int n = input2;
        int count = 0;
        int maxLen = 0;
        int i = 0;
        while (i < n) {
            int currLen = 1;
            // scan decreasing sequence
            while (i < n - 1 && input1[i] > input1[i + 1]) {
                currLen++;
                i++;
            }
            if (currLen > 1) {
                count++;
                if (currLen > maxLen)
                    maxLen = currLen;
            }
            i++;
        }
        return new Result(count, maxLen);
    }
}
