// Question
// Odd Digits' Sum

// Write a function (method) that takes as input a positive number and returns the sum of only the odd digits in the given number.

// Assumption: The input number will be a positive integer number 
// ≥1 and ≤25000.

// Example 1:
// If the number is 9515, the OddDigitsSum will be 9+5+1+5=20.

// Example 2:
// If the number is 2134, the OddDigitsSum will be 1+3=4.

public int OddDigitsSum(int input1){
    int sum = 0;
    while(input1 > 0){
        int digit = input1 % 10;
        if(digit % 2 != 0){
            sum += digit;
        }
        input1 /= 10;
    }
    return sum;
}
