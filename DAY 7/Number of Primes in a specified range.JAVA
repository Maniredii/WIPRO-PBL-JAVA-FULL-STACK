
// Question
// Number of Prime numbers in a specified range

// Write a function to find the count of the number of prime numbers in a specified range. The starting and ending number of the range will be provided as input parameters to the function.

// Assumption:
// 2 <= starting number of the range <= ending number of the range <= 7919

// Examples:

// If the starting and ending number of the range is given as 2 and 20, the method must return 8, because there are 8 prime numbers in the specified range from 2 to 20, namely {2, 3, 5, 7, 11, 13, 17, 19}
// If the starting and ending number of the range is given as 700 and 725, the method must return 3, because there are 3 prime numbers in the specified range from 700 to 725, namely {701, 709, 719}

public int countPrimesInRange(int input1, int input2) {
	int count = 0;
	for(int num = input1; num <= input2; num++) {
		if(isPrime(num)) {
			count++;
		}
	}
	return count;
}

private boolean isPrime(int n) {
	if(n < 2) return false;
	for(int i = 2; i <= (int)Math.sqrt(n); i++) {
		if(n % i == 0)
			return false;
	}
	return true;
}