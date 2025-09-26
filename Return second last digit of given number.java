// Question
// Return second last digit of the given number.

// Write a function that returns the second last digit of the given number. The second last digit is referred to as the digit in the tens place in the given number.

// For example:
// If the given number is 197, the second last digit is 9.

// Note: The second last digit should be returned as a positive number, i.e., if the given number is -197, the second last digit is 9.

// Note 2: If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1.
// For instance, if the given number is 5, the second last digit should be returned as -1.

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int secondLastDigitOf(int input){
        // Read only region end
        // Write code here...
        input1 = Math.abs(input1);
        if(input1 < 10){
            return -1;
        }
        return (input1 / 10) % 10;
    }
}
