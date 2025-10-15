// Question: Second Word Uppercase Function
// Description:
// Write a function (method) named secondWordUppercase that takes a string input representing a sentence and returns the second word of the sentence in uppercase. If the input sentence contains less than two words, the function should return the word "LESS". The result should not have any leading or trailing spaces.

// Examples:
// If input is "Wipro Technologies Bangalore", the function should return "TECHNOLOGIES".

// If input is "Hello World", the function should return "WORLD".

// If input is "Championship 2017 League", the function should return "2017".

// If input is "Hello", the function should return "LESS".

// Notes:
// The input string may contain multiple spaces between words.

// The function should handle trimming spaces appropriately.

public String secondWordUppercase(String input1) {
    String[] words = input1.trim().split("\\s+");
    if (words.length < 2) {
        return "LESS";
    }
    return words[1].toUpperCase();
}
