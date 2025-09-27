// Question: Weight of String
// Problem Statement
// Write a function to calculate the weight of a given string as per the following rules:

// Weight Calculation:

// Only alphabetic characters are considered for weight calculation.

// Weight of a character is its position in the English alphabet (A/a=1, B/b=2, ..., Z/z=26).

// Upper and lower case letters are weighted equally.

// Vowel Handling:

// If input2 is 0, vowels should be ignored in the calculation.

// If input2 is 1, vowels should be included in the calculation.

// Non-alphabetic Characters:

// Ignore all non-alphabetic characters (e.g. spaces, punctuation).

// Inputs:
// input1: A string whose weight should be calculated.

// input2: Integer (0 or 1). 0 means vowels are ignored, 1 means vowels are included.

// Output:
// Return the weight as an integer.

// Example:
// "Hello World" with input2=0: Output is 89

// "Hello World" with input2=1: Output is 124

// "All Zebras are Black & White!!" with input2=0: Output is 186

// "All Zebras are Black & White!!" with input2=1: Output is 214

public int weightOfString(String input1, int input2) {
    
    String vowels = "aeiouAEIOU";
    int weight = 0;
    for (int i = 0; i < input1.length(); i++) {
        char ch = input1.charAt(i);
        
        if (Character.isLetter(ch)) {
            
            if (input2 == 0 && vowels.indexOf(ch) != -1) {
                continue;
            }
            
            weight += Character.toLowerCase(ch) - 'a' + 1;
        }
    }
    return weight;
}
