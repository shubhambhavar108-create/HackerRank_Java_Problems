/*Given two strings a and b.Check if both strings have:
Same letters
Same number of each letter
Uppercase and lowercase are treated as the same.
Return:
"Anagrams" if they match
"Not Anagrams" if they do not match
Example
anagram
margana
Both have:
a = 3
n = 1
g = 1
r = 1
m = 1
Output: Anagrams
Simple Logic 
Imagine 26 boxes for letters: a b c d e ... z
Read first string → remove letters from boxes (-1) Read second string → add letters to boxes (+1)
If all boxes become 0 at the end:
Both strings have same letters They are Anagrams 
Otherwise:

Not Anagrams */
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Array to store frequency of letters a-z
        int[] count = new int[26];

        // Process both strings together
        for (int i = 0; i < a.length(); i++) {

            // Decrease count for character from first string
            count[a.charAt(i) - 'a']--;

            // Increase count for character from second string
            count[b.charAt(i) - 'a']++;
        }

        // Check if all counts become 0
        for (int x : count) {

            // If any count is not 0, strings are not anagrams
            if (x != 0) {
                return false;
            }
        }

        // All counts are 0, so strings are anagrams
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read two strings
        String a = scan.next();
        String b = scan.next();

        scan.close();

        boolean ret = isAnagram(a, b);

        // Print result
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}
