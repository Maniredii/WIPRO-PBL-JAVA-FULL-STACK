/*

Problem Statement
Find the Most Frequently Occurring Digit in a Series of Numbers
Kamali is a data analyst in a lottery management organization.
One of the tasks assigned is to find the most frequently occurring digit in a series of numbers.

If more than one digit occurs with the same highest frequency, choose the largest digit among them.

Example 1:
Input:

1 occurs 3 times

2 occurs 3 times

3 occurs 2 times

4, 5, 7, 9: less than 2

6 occurs 4 times
Highest: 6 (4 times).
Output: 6

Example 2:
Input:

2, 6: 3 times

4, 7, etc.: less
Choose: 6 (higher of 2, 6).
Output: 6

*/

import java.io.*;
import java.util.*;

class UserMainCode {
    public int mostfrequentlyOccurringDigit(int[] input1, int input2) {
        int[] freq = new int[10];

        for (int i = 0; i < input2; i++) {
            int num = Math.abs(input1[i]);
            if (num == 0) freq[0]++;
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int maxFreq = 0;
        int result = 0;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] >= maxFreq) {
                maxFreq = freq[d];
                result = d; // This ensures in tie, larger digit is chosen
            }
        }

        return result;
    }
}
