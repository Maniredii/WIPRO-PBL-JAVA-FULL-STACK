// Question: Check if String is Palindrome
// Description:
// Write a function named isPalindrome to determine whether the input string is a palindrome or not.

// A palindrome is a string that reads the same backward as forward (e.g. abba, appa, amma, malayalam, madam, rotor, etc.).

// If the input string is a palindrome, the function should return 2.

// If the input string is not a palindrome, the function should return 1.

// Notes:
// The case of the letters does not matter. For example, Madam, mAdam, MADAM, etc. should all be considered palindromes.

// You can assume:

// The input will always be a single word (no sentences or spaces).

// The input will contain only alphabetic characters.

// Examples:
// Input: "madam" → Output: 2

// Input: "Malayalam" → Output: 2

// Input: "hello" → Output: 1

// Input: "Level" → Output: 2

// Input: "world" → Output: 1

public int isPalindrome(String input1) {
    
    input1 = input1.toLowerCase();
    int left = 0, right = input1.length() - 1;
    while (left < right) {
        if (input1.charAt(left) != input1.charAt(right)) {
            return 1;
        }
        left++;
        right--;
    }
    return 2;
}
