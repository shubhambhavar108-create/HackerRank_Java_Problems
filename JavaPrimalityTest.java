/*Given a large integer n, determine whether it is a prime number using Java's BigInteger.isProbablePrime() method.

Print:

prime

or

not prime*/
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the large number as a string
        String n = sc.next();

        // Convert string to BigInteger
        BigInteger num = new BigInteger(n);

        // Check if number is prime
        if (num.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();
    }
}
