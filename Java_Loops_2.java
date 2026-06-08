/*We have a You are given q queries in the form of a,b , and n. 
For each query, print the series corresponding to the given a,b , 
and n values as a single line of n space-separated integers.
the series is (a+2^0*b)(a+2^1*b)(a+2^n-1*b) 
*/


import java.util.*;
class Java_Loops_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int a,b,sum,n;
        for(int i=0;i<q;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            sum=a;
            for(int j=0;j<n;j++)
            {
              sum=sum+(int)Math.pow(2,j)*b;
              System.out.print(sum+" "); 
            }
            System.out.println();
        }
        sc.close();
    }
}