// Question
// Of the given 5 numbers, How many are even?

// Write a function that accepts 5 input parameters and returns the count of how many of those 5 are even.

// For example:

// If the five input parameters are 12, 17, 19, 14, and 115, there are two even numbers: 12 and 14. So, the function must return 2.

// If the five input parameters are 15, 0, 17, 19, and 28, there are three even numbers: 0, 14, and 28. So, the function must return 3.

// Observe that zero is also considered an even number.

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int countEvens(int input1, int input2, int input3, int input4, int input5){
        // Read only region end
        // Write code here...
        int count = 0;
        if(input1 % 2 == 0) count++;
        if(input2 % 2 == 0) count++;
        if(input3 % 2 == 0) count++;
        if(input4 % 2 == 0) count++;
        if(input5 % 2 == 0) count++;
        return count;
    }
}
