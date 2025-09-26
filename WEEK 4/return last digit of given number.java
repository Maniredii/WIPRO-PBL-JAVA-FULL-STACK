// Question
// Return last digit of the given number.

// Write a function that returns the last digit of the given number. Last digit is being referred to as the least significant digit, i.e., the digit in the ones (units) place in the given number.

// The last digit should be returned as a positive number.
// For example:
// If the given number is 197, the last digit is 7
// If the given number is -197, the last digit is 7

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int lastDigitOf(int input1){
        // Read only region end
        // Write code here...
        return Math.abs(input1 % 10);
    }
}
