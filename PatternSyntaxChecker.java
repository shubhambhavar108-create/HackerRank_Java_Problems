/*Given a regex pattern, check whether its syntax is correct.
If Pattern.compile(pattern) works → Print Valid
If it throws an exception → Print Invalid
Example
Input:([A-Z])(.+)
Output:Valid
Because the regex syntax is correct. ✅
Input:[AZ[a-z](a-z)
Output:Invalid*/
import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Read number of test cases
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {

            // Read regex pattern
            String pattern = in.nextLine();

            try {

                // Try compiling the regex
                Pattern.compile(pattern);

                // If no exception occurs
                System.out.println("Valid");

            } catch (Exception e) {

                // If regex syntax is wrong
                System.out.println("Invalid");
            }
        }

        in.close();
    }
}
