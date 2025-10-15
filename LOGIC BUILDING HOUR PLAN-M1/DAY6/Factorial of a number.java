// Question
// FACTORIAL of a number

// In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. For example:

// 5! = 5 × 4 × 3 × 2 × 1 = 120

// 4! = 4 × 3 × 2 × 1 = 24

// 9! = 9 × 8 × 7 × 6 × 5 × 4 × 3 × 2 × 1 = 362880

// Write a program to find the factorial of a given number.
// The given number will be passed to the function as an input parameter of type int.
// The function is expected to calculate the factorial of the given number and return it as an int type.

// Assumptions:

// The given input number will always be greater than or equal to 1.

// Due to the range supported by int, the input numbers will range from 1 to 12.

public int factorial(int input1){
    int fact = 1;
    for(int i = 1; i <= input1; i++){
        fact *= i;
    }
    return fact;
}
