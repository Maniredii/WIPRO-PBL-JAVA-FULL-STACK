// Question
// Is Palindrome Possible?
// Write a function to find whether it is possible to get a palindrome number from a given number by re-arranging the positions of its digits. If yes, the function should return 2; else, it should return 1.

// Example 1: If the given number is 125211, it is possible to form a palindrome (e.g., 215512 or 125521). The function must return 2.
// Example 2: If the given number is 12153, it is not possible to form a palindrome by re-arranging its digits. The function must return 1.

// Note: All digits of the given number should be retained while deciding whether they can together form a palindrome.

// Assumption: The input number will be a positive integer number: 1 \leq N \leq 25000

import java.io.*;
import java.util.*;

class UserMainCode {
    public int isPalindromePossible(int input1) {
        int[] digitCount = new int[10];
        while (input1 > 0) {
            int digit = input1 % 10;
            digitCount[digit]++;
            input1 = input1 / 10;
        }
        int oddCount = 0;
        for (int count : digitCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        // For palindrome: at most one digit can have odd count
        if (oddCount <= 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
