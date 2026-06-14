/*Given an array of integers, count how many subarrays have a negative sum.

A subarray is a contiguous part of the array.*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Create array
        int[] a = new int[n];

        // Store array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        // Generate all possible subarrays
        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                // Add current element to subarray sum
                sum += a[j];

                // Count negative subarrays
                if (sum < 0) {
                    count++;
                }
            }
        }

        // Print answer
        System.out.println(count);

        sc.close();
    }
}
