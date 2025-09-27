// Question: Most Frequent Digit
// Description
// Write a function to find and return the most frequent digit among four input numbers.

// Function prototype:


// int MostFrequentDigit(int input1, int input2, int input3, int input4)
// Inputs:

// input1, input2, input3, input4: Four integer numbers.

// Output:

// Returns the digit (0–9) that appears most frequently across all four numbers.

// Notes:

// If more than one digit occurs the same (maximum) number of times, return the highest such digit.

// Examples
// Example 1:
// input1=123, input2=234, input3=345, input4=673
// Most frequent digit is 3 (occurs 4 times)
// Output: 3

// Example 2:
// input1=123, input2=456, input3=345, input4=5043
// Digits 3, 4, and 5 occur 3 times each, so the highest is 5
// Output: 5

// Example 3:
// input1=1203, input2=7624, input3=2046, input4=1052
// Digit 2 is the most frequent
// Output: 2

// Example 4:
// input1=1203, input2=7624, input3=2046, input4=1002
// Digits 2 and 0 both occur 5 times, so return 2
// Output: 2

public int MostFrequentDigit(int input1, int input2, int input3, int input4) {
    int[] freq = new int[10];
    int[] nums = {input1, input2, input3, input4};
    for (int num : nums) {
        num = Math.abs(num); // Handle negatives, if any
        if (num == 0) freq[0]++;
        while (num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
    }
    int maxFreq = 0, result = 0;
    for (int i = 0; i < 10; i++) {
        if (freq[i] > maxFreq || (freq[i] == maxFreq && i > result)) {
            maxFreq = freq[i];
            result = i;
        }
    }
    return result;
}
