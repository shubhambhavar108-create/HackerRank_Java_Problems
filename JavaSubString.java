
// Q.Extract substring from start index to end index (end not included)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // Read the input string
        String S = in.next();

        // Read the starting index of substring
        int start = in.nextInt();

        // Read the ending index of substring
        int end = in.nextInt();

        // Close the Scanner
        in.close();

        S = S.substring(start, end);//for extracting substring.

        // Print the extracted substring
        System.out.println(S);
    }
}
