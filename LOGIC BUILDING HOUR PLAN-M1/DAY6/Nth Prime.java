// Question
// pyNthPrime

// Write a function that finds and returns the Nth prime number. N will be passed as input to the function.

// Assumption:
// 1 <= N <= 1000, where N is the position of the prime number.

// The first prime number is 2

// The second prime number is 3

// The third prime number is 5

// The fourth prime number is 7

// The fifth prime number is 11

// The sixth prime number is 13

// ... and so on.

// Examples:

// If the given number N is 10, the method must return the 10th prime number, i.e. 29.

// If the given number N is 13, the method must return the 13th prime number, i.e. 41.

public int NthPrime(int input1){
    int count = 0;
    int num = 2;
    while(true){
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            count++;
            if(count == input1)
                return num;
        }
        num++;
    }
}
