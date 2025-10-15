// Question
// Sum of last digits of two given numbers

// Rohit wants to add the last digits of two given numbers.

// For example,
// If the given numbers are 267 and 154, the output should be 11.

// Below is the explanation:
// Last digit of 267 is 7
// Last digit of 154 is 4
// Sum of 7 and 4 = 11

// Write a program to help Rohit achieve this for any given two numbers.

// The prototype of the method should be:
// int addLastDigits(int input1, int input2);
// where input1 and input2 denote the two numbers whose last digits are to be added.

// Note: The sign of the input numbers should be ignored.

// If the input numbers are 267 and 154, the sum of last two digits should be 11.

// If the input numbers are -267 and 154, the sum of last two digits should be 11.

// If the input numbers are 267 and -154, the sum of last two digits should be 11.

// If the input numbers are -267 and -154, the sum of last two digits should be 11.

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int addLastDigits(int input1, int input2){
        // Read only region end
        // Write code here...
        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);
        return lastDigit1 + lastDigit2;
    }
}
