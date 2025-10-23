/**
 * @author <MANIDEEP REDDY EEVURI>
 


Question 2
How to Attempt?
Find first repeated element in the given array from the tail of the array:
Rajeev works in the data center lab of the survey department. He has been assigned the task of identifying "repeated numbers" in a given set of numbers. He approaches you to help him achieve this.

Given an array of numbers, your task is to return the first number that repeats (appears again) starting from the last index.

For example
If input1 = representing the given array, and​
input2 = 6 representing the number of elements in the array,
then the result should be 2 which is the first repeated number in the array from the rear end.

Special conditions to be taken care:
Note 1: You should ignore the negative numbers and zeros. The program should consider only non-zero, non-negative numbers from the given array.

Note 2: If no number is repeated then the output should be the last element of the array.

Note 3: If all elements in the array are negative or 0’s the output should be 0.

*/

import java.io.*;
import java.util.*;


class UserMainCode
{
    public int findRepArray(int[] input1, int input2)
    {
        
        
        Set<Integer> seen = new HashSet<>();
        
        
        for (int i = input2 - 1; i >= 0; i--)
        {
            int num = input1[i];
            
            
            if (num <= 0)
                continue;
            
            if (seen.contains(num))
                return num;  
            
            seen.add(num);
        }
        
        
        boolean allNonPositive = true;
        for (int i = 0; i < input2; i++) {
            if (input1[i] > 0) {
                allNonPositive = false;
                break;
            }
        }
        
        if (allNonPositive)
            return 0;  
        
        return input1[input2 - 1];  
    }
}