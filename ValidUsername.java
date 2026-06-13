/*Write a regex to validate usernames.

Rules:

Length must be 8 to 30 characters.
First character must be a letter (A-Z or a-z).
Remaining characters can contain:
Letters
Digits
Underscore (_)*/
import java.util.Scanner;

class UsernameValidator {

    // Username:
    // 1. Starts with a letter
    // 2. Contains only letters, digits, and _
    // 3. Length between 8 and 30 characters
    public static final String regularExpression =
            "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {

            String userName = sc.nextLine();

            // Check username using regex
            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
