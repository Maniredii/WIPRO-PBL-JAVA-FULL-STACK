/**
 * @author <MANIDEEP REDDY EEVURI>
 
Assignment Question
Sum of Sums of Digits in Cyclic Order
Alex was asked to find the sum of all possible sums of the digits of a given number, when treated in cyclic order. For example, if the input is 1820, the result is calculated by:

1st sum: 1 + 8 + 2 + 0 = 11
2nd sum: 8 + 2 + 0 + 1 = 11
3rd sum: 2 + 0 + 1 + 8 = 11
4th sum: 0 + 1 + 8 + 2 = 11
Sum of all: 11 + 11 + 11 + 11 = 44

You need to implement the function sumOfSumsOfDigits(int input) to return the required result for any integer input. The number will always have more than 1 digit.


How to Solve
Step-by-step Approach
Convert the input number to a string and then an array of digits for easy manipulation.
For each cyclic rotation:

Sum the digits.
Rotate digits for the next cycle.
Return the total sum of all cycle sums.

*/

class UserMainCode {
    public int sumOfSumsOfDigits(int input1) {
        String numStr = Integer.toString(input1);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int tempSum = 0;
            for (int j = i; j < numStr.length(); j++) {
                tempSum += numStr.charAt(j) - '0';
            }
            sum += tempSum;
        }
        return sum;
    }
}

