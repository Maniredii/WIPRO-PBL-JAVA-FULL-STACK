/**
 * @author MANIDEEP REDDY EEVURI
 

Question: Encoding Three Strings
Anand was assigned the task of coming up with an encoding mechanism for any given three strings. He has come up with the below plan:

Step 1: Split Each String
Given any three strings, break each string into 3 parts according to these rules:

If the number of characters in the string is divisible by 3, each split part will contain an equal number of characters.

If the number of characters in the string is of the form 

3k+1, the MIDDLE part will have one extra character.

If the number of characters in the string is of the form 

3k+2, the FRONT and END parts will each have one extra character.

For example, "Johny" has 5 characters:

5mod3=2, so FRONT and END get one extra character each:

FRONT: indices 0 to 1 ("Jo")

MIDDLE: index 2 ("h")

END: indices 3 to 4 ("ny")

Step 2: Concatenate Parts
Create three new output strings:

Output1: FRONT part of input1 + FRONT part of input2 + FRONT part of input3

Output2: MIDDLE part of input1 + MIDDLE part of input2 + MIDDLE part of input3

Output3: END part of input1 + END part of input2 + END part of input3

Step 3: Toggle Case in Output3
In Output3, toggle the case of every character (uppercase to lowercase, and vice versa).

Final Output:
Return the three output strings as members of an object or as individual strings, in the order: Output1, Output2, Output3.

Example:
Input:
  John, Johny, Janardhan

Step 1 (splitting):
  "John"      → ["J",   "o",    "hn"]
  "Johny"     → ["Jo",  "h",    "ny"]
  "Janardhan" → ["Jan", "ard",  "han"]

Step 2 (concatenate):
  Output1: J + Jo + Jan = "JJoJan"
  Output2: o + h + ard = "ohard"
  Output3: hn + ny + han = "hnnyhan"

Step 3 (toggle case for Output3):
  Output3: "hnnyhan" → "HNNYHAN"

So,
Output1:  "JJoJan"
Output2:  "ohhard"
Output3:  "NNYHAN"

*/




import java.io.*;
import java.util.*;

class UserMainCode {

    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3){
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3) {
        String[] split1 = splitString(input1);
        String[] split2 = splitString(input2);
        String[] split3 = splitString(input3);

        String output1 = split1[0] + split2[0] + split3[0];
        String output2 = split1[1] + split2[1] + split3[1];
        String output3 = split1[2] + split2[2] + split3[2];

        output3 = toggleCase(output3);

        return new Result(output1, output2, output3);
    }

    private String[] splitString(String str) {
        int len = str.length();
        int front, mid, end;

        if (len % 3 == 0) {
            front = mid = end = len / 3;
        } else if (len % 3 == 1) {
            front = len / 3;
            mid = len / 3 + 1;
            end = len / 3;
        } else { // len % 3 == 2
            front = len / 3 + 1;
            mid = len / 3;
            end = len / 3 + 1;
        }

        String part1 = str.substring(0, front);
        String part2 = str.substring(front, front + mid);
        String part3 = str.substring(front + mid, len);

        return new String[] { part1, part2, part3 };
    }

    private String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
