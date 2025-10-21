/*
Problem Statement
Sum of Powers of Digits
Alex has been asked by his teacher to do an assignment on powers of numbers. The assignment requires Alex to find the sum of powers of each digit of a given number, as per the below method:

For a number, sum up each digit (di)raised to the power of the next digit (di+1) (from left to right). The last digit is raised to the power of 0.

Example:
If the given number is 582109, the sum should be:

5^8 + 8^2 + 2^1 + 1^0 + 0^9 + 9^0 = 390625 + 64 + 2 + 1 + 0 + 1 = 390693

*/

import java.io.*;
import java.util.*;

class UserMainCode {
    public int sumOfPowerOfDigits(int input1) {
        String str = String.valueOf(input1);
        int sum = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int base = str.charAt(i) - '0';
            int exp = (i < n - 1) ? str.charAt(i + 1) - '0' : 0;
            sum += (int) Math.pow(base, exp);
        }

        return sum;
    }
}
