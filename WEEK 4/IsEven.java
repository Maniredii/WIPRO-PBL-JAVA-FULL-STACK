// Question
// IsEven?

// Write a function to find whether the given input number is even.
// If the given number is even, the function should return 2 else it should return 1.
// Note: The number passed to the function can either be negative, positive, or zero.
// Zero should be treated as even.

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int isEven(int input){
        // Read only region end
        // Write code here...
        if(input % 2 == 0){
            return 2;
        } else {
            return 1;
        }
    }
}
