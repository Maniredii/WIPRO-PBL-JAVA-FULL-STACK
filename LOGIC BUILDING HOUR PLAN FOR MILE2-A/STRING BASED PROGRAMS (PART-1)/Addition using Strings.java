/*
Problem Statement
Addition using Strings
Write a function that takes two numbers in string format and forms a string containing the sum (addition) of these two numbers.

Assumptions:

The input strings will contain only numeric digits.

The input strings can be of any large lengths.

The lengths of the two input strings need not be the same.

The input strings will represent only positive numbers.

Examples:

If input strings are "1234" and "56", the output string should be "1290".

If input strings are "56" and "1234", the output string should be "1290".

If input strings are "12345673218957843215432" and "987612673489652", the output string should be "12346660831631332868084".

Note: In Java 8+, this logic can be easily implemented using BigInteger. However, to test and advance your programming skills, use manual string processing instead of BigInteger.

*/

import java.io.*;
import java.util.*;

class UserMainCode {
    public String addNumberStrings(String input1, String input2) {
        // Start from the rightmost ends of both strings
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Add digits from both strings
        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if(i >= 0) sum += input1.charAt(i--) - '0';
            if(j >= 0) sum += input2.charAt(j--) - '0';
            result.append(sum % 10);
            carry = sum / 10;
        }

        // Digits are in reverse order, so reverse the result
        return result.reverse().toString();
    }
}
