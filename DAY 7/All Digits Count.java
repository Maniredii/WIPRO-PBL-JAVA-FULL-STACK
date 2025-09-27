// Question
// All Digits Count

// Write a function to find the count of ALL digits in a given number N. The number will be passed to the function as an input parameter of type int.

// Assumption: The input number will be a positive integer number >= 1 and <= 25000.

// For example:

// If the given number is 292, the function should return 3 because there are 3 digits in this number.
// If the given number is 1015, the function should return 4 because there are 4 digits in this number.


public int allDigitsCount(int input1) {
	int count = 0;
	while(input1 > 0) {
		input1 = input1 / 10;
		count++;
	}
	return count;
}
