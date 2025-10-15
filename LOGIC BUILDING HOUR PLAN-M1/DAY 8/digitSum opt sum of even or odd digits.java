// Question
// Even OR Odd Digits' Sum

// Write a function that takes as input a positive number and a string parameter, and performs digit-sum of only the even digits or only the odd digits in the given number, based on the option ("even" or "odd").

// The function will take two input parameters:

// The first parameter is an integer representing the number whose digit sum needs to be found.

// The second parameter is a string representing the option, which will be either "even" or "odd".

// Assumption:
// The input number (input1) will be a positive integer number >= 1 and <= 25000.
// The input string (input2) will always be either "even" or "odd".

// Example 1:
// If the given number is 9625 and the option is "odd", sum only the odd digits: 9 + 5 = 14.

// Example 2:
// If the given number is 2134 and the option is "even", sum only the even digits: 2 + 4 = 6.

public int EvenOrOddDigitsSum(int input1, String input2){
    int sum = 0;
    while(input1 > 0){
        int digit = input1 % 10;
        if(input2.equalsIgnoreCase("even") && digit % 2 == 0){
            sum += digit;
        } else if(input2.equalsIgnoreCase("odd") && digit % 2 != 0){
            sum += digit;
        }
        input1 /= 10;
    }
    return sum;
}
