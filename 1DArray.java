/*Given n integers, store them in an array and print each element on a new line.*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Read size of array
        int n = scan.nextInt();

        // Create array of size n
        int[] a = new int[n];

        // Store elements in array
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        // Print all array elements
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
