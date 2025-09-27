// Question
// Even Digits' Sum

// Write a function (method) that takes as input a positive integer and returns the sum of only the even digits in the given number.
// Assumption: The input number will be a positive integer number 

// ≥1 and ≤25000.

// Example 1:
// If the number is 8625, the even digits are 6 and 2. Their sum is 

// 6+2=8.

// Example 2:
// If the number is 2134, the even digits are 2 and 4. Their sum is 
// 2+4=6.

public int EvenDigitsSum(int input1){
    int sum = 0;
    while(input1 > 0){
        int digit = input1 % 10;
        if(digit % 2 == 0){
            sum += digit;
        }
        input1 /= 10;
    }
    return sum;
}
