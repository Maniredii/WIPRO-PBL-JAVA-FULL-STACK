// Question
// Is N an exact multiple of M?

// Write a function that accepts two parameters and finds whether the first parameter is an exact multiple of the second parameter.

// If the first parameter is an exact multiple of the second parameter, the function should return 2; else it should return 1.

// If either of the parameters are zero, the function should return 3.

// Assumption:

// The first parameter can be positive, negative, or zero.

// The second parameter will always be non-zero.

// Function prototype:
// int isMultiple(int input1, int input2);

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int isMultiple(int input1, int input2){
        // Read only region end
        // Write code here...
        if(input1 == 0 || input2 == 0){
            return 3;
        }
        if(input1 % input2 == 0){
            return 2;
        } else {
            return 1;
        }
    }
}
