// Question
// nthFibonacci

// Write a function to return the nth number in the Fibonacci series.
// The value of n will be passed to the function as an input parameter.

// NOTE: Fibonacci series looks like:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... and so on.
// Fibonacci series starts with 0 and 1 and continues generating the next number as the sum of the previous two numbers.

// First Fibonacci number is 0

// Second Fibonacci number is 1

// Third Fibonacci number is 1

// Fourth Fibonacci number is 2

// Fifth Fibonacci number is 3

// Sixth Fibonacci number is 5

// Seventh Fibonacci number is 8

// and so on.

public long nthFibonacci(int input1){
    if(input1 == 1) return 0;
    if(input1 == 2) return 1;
    long a = 0, b = 1, c = 0;
    for(int i = 3; i <= input1; i++){
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}
