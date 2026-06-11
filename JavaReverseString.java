/*
Question:
A string is called a palindrome if it reads the same
forward and backward.

Given a string, print "Yes" if it is a palindrome,
otherwise print "No".

Example:
Input:
madam

Output:
Yes
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String s = sc.next();

        // Variable to store reversed string
        String rev = "";

        // Close Scanner
        sc.close();

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Check if original string and reversed string are equal
        if (s.equalsIgnoreCase(rev)) {

            // String is a palindrome
            System.out.println("Yes");

        } else {

            // String is not a palindrome
            System.out.println("No");
        }
    }
}
