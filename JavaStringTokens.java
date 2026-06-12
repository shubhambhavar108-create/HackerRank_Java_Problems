/*Given a string s: Split the string into words (tokens).
A token contains only English letters (A-Z or a-z).
Symbols like ! , ? . _ ' @ and spaces are separators.
Print  :Number of tokens Each token on a new line
Example
Input:
He is a very very good boy, isn't he?
Tokens:
He
is
a
very
very
good
boy
isn
t
he
Total Tokens:
10*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read complete input string
        String s = scan.nextLine().trim();

        // If string is empty
        if (s.length() == 0) {
            System.out.println(0);
            scan.close();
            return;
        }

        // Split string using given separators
        String[] arr = s.split("[ !,?._'@]+");

        // Print number of tokens
        System.out.println(arr.length);

        // Print each token on a new line
        for (String str : arr) {
            System.out.println(str);
        }

        scan.close();
    }
}
