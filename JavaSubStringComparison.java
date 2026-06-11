/*
Question:
Given a string s and an integer k, find the lexicographically
smallest and largest substrings of length k.

Example:
Input:
welcometojava
3

Output:
ava
wel
*/

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {

        // Initialize smallest and largest with the first substring
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Loop through all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {

            // Get current substring of length k
            String c = s.substring(i, i + k);

            // Update smallest if current substring is smaller
            if (c.compareTo(smallest) < 0) {
                smallest = c;
            }

            // Update largest if current substring is larger
            if (c.compareTo(largest) > 0) {
                largest = c;
            }
        }

        // Return smallest and largest substrings separated by a new line
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);

        // Read the input string
        String s = scan.next();

        // Read the value of k
        int k = scan.nextInt();

        // Close Scanner
        scan.close();

        // Print the smallest and largest substrings
        System.out.println(getSmallestAndLargest(s, k));
    }
}
