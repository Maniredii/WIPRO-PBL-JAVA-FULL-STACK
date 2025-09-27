// Question
// digitSum

// Write a function (method) that takes as input a large integer and returns a single digit by performing continuous digit sum operations. The process is repeated until the resulting number is a single digit between 1 to 9.

// If the input number is negative, the result should also be negative.

// Examples:

// For input 975592, 9+7+5+5+9+2=37, then 3+7=10, then 1+0=1. The single-digit digitSum is 1.

// For input 123456, 1+2+3+4+5+6=21, then 2+1=3. The digitSum is 3.

public int digitSum(int input1){
    boolean negative = input1 < 0;
    input1 = Math.abs(input1);

    while (input1 >= 10) {
        int sum = 0;
        while (input1 > 0) {
            sum += input1 % 10;
            input1 /= 10;
        }
        input1 = sum;
    }
    return negative ? -input1 : input1;
}
