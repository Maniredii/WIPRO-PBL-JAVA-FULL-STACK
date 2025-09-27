// Question
// Create PIN using three given input numbers
// You have been asked to work on a module that is expected to generate PINs using three input numbers.

// Assumptions:

// The three given input numbers will always consist of three digits each.

// Each number will be in the range 100≤input≤999.

// Rules for generating the PIN:

// The PIN should be made up of 4 digits.

// The unit (ones) position should be the least of the units position of the three input numbers.

// The tens position should be the least of the tens position of the three input numbers.

// The hundreds position should be the least of the hundreds position of the three input numbers.

// The thousands position should be the maximum of all the digits in the three input numbers.

// Examples:
// Example 1:
// input1 = 123
// input2 = 582
// input3 = 175
// PIN = 8122

// Example 2:
// input1 = 190
// input2 = 267
// input3 = 853
// PIN = 9150

import java.io.*;
import java.util.*;

class UserMainCode {
    public int createPIN(int input1, int input2, int input3) {
        // Extract digits
        int[] arr = {input1, input2, input3};
        int maxDigit = -1;

        int ones = Math.min(arr[0]%10, Math.min(arr[1]%10, arr[2]%10));
        int tens = Math.min((arr[0]/10)%10, Math.min((arr[1]/10)%10, (arr[2]/10)%10));
        int hundreds = Math.min((arr[0]/100)%10, Math.min((arr[1]/100)%10, (arr[2]/100)%10));

        // Find max of all 9 digits
        for (int num : arr) {
            int d1 = num % 10;
            int d2 = (num / 10) % 10;
            int d3 = (num / 100) % 10;
            maxDigit = Math.max(maxDigit, Math.max(d1, Math.max(d2, d3)));
        }

        // PIN = thousands(here: max), hundreds, tens, ones
        return maxDigit*1000 + hundreds*100 + tens*10 + ones;
    }
}
