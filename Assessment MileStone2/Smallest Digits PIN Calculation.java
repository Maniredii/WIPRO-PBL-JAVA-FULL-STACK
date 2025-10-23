/**
 * @author: MANIDEEP REDDY EEVURI

 


Smallest Digits PIN Calculation
Problem Statement
You are at Level-1 of a Maths game.

You are provided with 4 numbers—input1, input2, input3, and input4—and are expected to find a secret PIN.

The three numbers input1, input2, and input3 are four-digit numbers within the range:

1000 ≤ input1 ≤ 9999

1000 ≤ input2 ≤ 9999

1000 ≤ input3 ≤ 9999

input4 is a positive integer.

Task
Compute the PIN using the following formula:

text
PIN = (smallest digit in input1) × (smallest digit in input2) × (smallest digit in input3) + input4
Example
If:

input1 = 3521

input2 = 2452

input3 = 1352

input4 = 38

Then:

Smallest digit in input1 = 1

Smallest digit in input2 = 2

Smallest digit in input3 = 1

Therefore,

text
PIN = (1 × 2 × 1) + 38 = 2 + 38 = 40
Assume the 4 numbers are provided as input to the function. Complete the function to find and return the PIN.
*/


import java.io.*;
import java.util.*;


class UserMainCode
{
    public int findPIN(int input1, int input2, int input3, int input4)
    {
        
        
        int min1 = getSmallestDigit(input1);
        int min2 = getSmallestDigit(input2);
        int min3 = getSmallestDigit(input3);
        
        int pin = (min1 * min2 * min3) + input4;
        return pin;
    }
    
    private int getSmallestDigit(int num)
    {
        int min = 9;
        while (num > 0)
        {
            int digit = num % 10;
            if (digit < min)
                min = digit;
            num /= 10;
        }
        return min;
    }
}