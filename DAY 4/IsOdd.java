// IsOdd?

// Write a function to find whether the given input number is odd.
// If the given number is odd, the function should return 2 else it should return 1.
// Note: The number passed to the function can either be negative, positive, or zero.
// Zero should NOT be treated as odd.

import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode
{
    public int isOdd(int input){
        // Read only region end
        // Write code here...
        if(input % 2 != 0){
            return 2;
        } else {
            return 1;
        }
    }
}
