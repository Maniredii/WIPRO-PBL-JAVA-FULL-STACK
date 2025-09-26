// Question
// Of the given 5 numbers, How many are even or odd?

// Write a function that accepts 6 input parameters:

// The first 5 input parameters are of type int.

// The sixth input parameter is of type string.

// If the sixth parameter contains the value "even", the function should return the count of how many of the first five input parameters are even.
// If the sixth parameter contains the value "odd", the function should return the count of how many of the first five input parameters are odd.

// For example:

// If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "odd", the function must return 3 (since there are three odd numbers: 17, 19, 115).

// If the five input parameters are 12, 17, 19, 14, and 115, and the sixth parameter is "even", the function must return 2 (there are two even numbers: 12, 14).

// Note: Zero is considered an even number.



public int countEvensOdds(int input1, int input2, int input3, int input4, int input5, String input6){
    int even = 0, odd = 0;
    int[] arr = {input1, input2, input3, input4, input5};
    for(int num : arr){
        if(num % 2 == 0)
            even++;
        else
            odd++;
    }
    if(input6.equalsIgnoreCase("even")){
        return even;
    } else if(input6.equalsIgnoreCase("odd")){
        return odd;
    } else {
        return -1;
    }
}
