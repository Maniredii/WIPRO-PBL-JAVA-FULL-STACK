// Question
// Unique Digits Count

// Write a function to find the count of unique digits in a given number N. The number will be passed to the function as an input parameter of type int.

// Assumption: The input number will be a positive integer number >= 1 and <= 25000.

// For example:

// If the given number is 292, the function should return 2 because there are only 2 unique digits '2' and '9' in this number.
// If the given number is 1015, the function should return 3 because there are 3 unique digits in this number, '1', '0', and '5'.

public int uniqueDigitsCount(int input1) {
	boolean[] seen = new boolean[10];
	int count = 0;
	while(input1 > 0) {
		int digit = input1 % 10;
		if(!seen[digit]) {
			seen[digit] = true;
			count++;
		}
		input1 /= 10;
	}
	return count;
}