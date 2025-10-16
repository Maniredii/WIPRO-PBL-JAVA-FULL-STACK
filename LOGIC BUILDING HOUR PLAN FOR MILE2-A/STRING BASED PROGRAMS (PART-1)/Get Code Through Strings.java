/*
Problem Statement
Get Code Through Strings
Farah is one of the few associates in Global Safe Lockers Corp Limited, who has access to the company’s exclusive locker that holds confidential information related to her division. The PIN to the locker gets changed every two days. Farah receives the PIN in the form of a string which she needs to decode to get the single-digit numeric PIN.

The numeric PIN can be obtained by adding the lengths of each word of the string to get the total length, and then continuously adding the digits of the total length till we get a single digit.

Example:
If the string is “Wipro Technologies”, the numeric PIN will be 8.

Length of the word “Wipro” = 5

Length of the word “Technologies” = 12

Total Length = 5 + 12 = 17

Add digits: 1 + 7 = 8 (single-digit PIN)

For the string “The Good The Bad And The Ugly”, the numeric PIN would be:

Lengths: 3 + 4 + 3 + 3 + 3 + 4 = 20

Add digits: 2 + 0 = 2 (single-digit PIN)

Assumptions:

The given string will always contain more than one word.
*/



import java.io.*;
import java.util.*;

class UserMainCode {
    public int getCodeThroughStrings(String input1) {
        if (input1 == null || input1.trim().isEmpty())
            return -1; // Invalid input check

        // Split the sentence into words by spaces
        String[] words = input1.trim().split("\\s+");
        int totalLength = 0;

        // Sum lengths of all words
        for (String word : words) {
            totalLength += word.length();
        }

        // Reduce to a single digit by repeatedly summing digits
        while (totalLength >= 10) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }
            totalLength = sum;
        }

        return totalLength;
    }
}
