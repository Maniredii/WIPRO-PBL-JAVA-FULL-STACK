/*
Problem Statement: FindStringCode
Question
Crazy Zak has designed a set of steps that can be applied on any given string (sentence) to produce a number.

Steps:
STEP 1: In each word, find the sum of the difference between the first letter and the last letter, the second letter and the penultimate letter, and so on till the center of the word.

STEP 2: Concatenate the sums of each word to form the result.

Alphabet Value:
The value of each letter is its position in the English alphabet, e.g., a = 1, b = 2, c = 3, ..., z = 26 (case-insensitive).

Details:
After subtracting, always use the absolute value.

Input will have only alphabet characters and one space between consecutive words.

Example:
Input:
"World Wide Web"

Step 1:

WORLD: |23-4| + |15-18| = 19 + 3 = 22; (single odd letter remains unused)

WIDE: |23-5| + |9-4| = 18 + 5 = 23

WEB: |23-2| + |5-4| = 21 + 1 = 22

Step 2:

Concatenate results: 22 23 22

Output: 222322
*/



------------------------------code starts from here-----------------------------------------



import java.io.*;
import java.util.*;

class UserMainCode {
    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        
        StringBuilder finalCodeBuilder = new StringBuilder();
        
        for (String word : words) {
            int wordSum = 0; 
            
            String upperCaseWord = word.toUpperCase();
            int wordLength = upperCaseWord.length();
            
            for (int i = 0; i < wordLength / 2; i++) {
                char firstChar = upperCaseWord.charAt(i);
                char lastChar = upperCaseWord.charAt(wordLength - 1 - i);
                
                int position1 = firstChar - 'A' + 1;
                int position2 = lastChar - 'A' + 1;
                
                int difference = Math.abs(position1 - position2);
                wordSum += difference;
            }

            if (wordLength % 2 != 0) {
                char centerChar = upperCaseWord.charAt(wordLength / 2);
                int centerPosition = centerChar - 'A' + 1;
                wordSum += centerPosition;
            }
            
            finalCodeBuilder.append(wordSum);
        }
        
        return Integer.parseInt(finalCodeBuilder.toString());
    }
}