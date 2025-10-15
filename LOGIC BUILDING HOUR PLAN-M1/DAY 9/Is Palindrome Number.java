// Question
// Is Palindrome Number?
// Write a function to find whether the given number 
// N
// N is a palindrome.

// A palindrome number is one that reads the same backwards as well as forwards. For example, 252, 18981, 5005 are examples of palindrome numbers.

// The number will be passed to the function as an input parameter of type int.
// If the number is a palindrome, the function should return 2, else it should return 1.

// Assumption: The input number will be a positive integer: 1≤N≤25000

import java.io.*;
import java.util.*;

class UserMainCode {
    public int isPalindromeNum(int input1) {
        int original = input1;
        int reversed = 0;
        while (input1 > 0) {
            int digit = input1 % 10;
            reversed = reversed * 10 + digit;
            input1 = input1 / 10;
        }
        if (original == reversed) {
            return 2;
        } else {
            return 1;
        }
    }
}
