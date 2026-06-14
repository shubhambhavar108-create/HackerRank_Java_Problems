/*Given two very large integers a and b.

Print:

a + b
a × b

Since the numbers can be extremely large, use Java's BigInteger class*/
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two large numbers
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        // Print sum of a and b
        System.out.println(a.add(b));

        // Print product of a and b
        System.out.println(a.multiply(b));

        sc.close();
    }
}
