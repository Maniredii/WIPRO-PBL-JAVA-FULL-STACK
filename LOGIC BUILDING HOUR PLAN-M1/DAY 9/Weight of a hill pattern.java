// Question
// Weight of a Hill Pattern

// You are expected to find the total weight of the hill pattern.

// Inputs:

// The total levels in a hill pattern (input1).

// The weight of the head level (input2).

// The weight increment of each subsequent level (input3).

// Details:

// "Total levels" represents the number of rows in the pattern.

// "Head level" represents the first row.

// Weight of a level represents the value of each star (asterisk) in that row.

// The hill pattern will be in the format:

// text
// *
// **
// ***
// ****
// ...
// At level 
// N
// N there will be 
// N
// N stars.

// Examples:
// Example 1:

// Total levels = 5

// Head level (row 1) weight = 10

// Weight increment per subsequent level = 2
// Total weight is calculated as sum of weights of all stars in each row:

// Total=10×1+12×2+14×3+16×4+18×5=230
// Example 2:

// Total levels = 4

// Head level (row 1) weight = 1

// Weight increment per subsequent level = 5
// Total weight:


// Total=1×1+6×2+11×3+16×4=110


import java.io.*;
import java.util.*;

class UserMainCode {
    public int totalHillWeight(int input1, int input2, int input3) {
        int totalWeight = 0;
        int currentWeight = input2;
        for (int level = 1; level <= input1; level++) {
            totalWeight += level * currentWeight;
            currentWeight += input3;
        }
        return totalWeight;
    }
}
