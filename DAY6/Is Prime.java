// Question
// isPrime?

// Write a function that finds whether the given number N is Prime or not.
// If the number is prime, the function should return 2; else it must return 1.

// Assumption:
// 2 <= N <= 5000, where N is the given number.

// Examples:

// If the given number N is 7, the method must return 2.

// If the given number N is 10, the method must return 1.

public int isPrime(int input1){
    if(input1 < 2) return 1;
    int sqrtVal = (int)Math.sqrt(input1);
    for(int i = 2; i <= sqrtVal; i++){
        if(input1 % i == 0)
            return 1;
    }
    return 2;
}
