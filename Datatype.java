/*Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor. */
import java.util.*;
public class Datatype 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            try{
                Long n=Long.parseLong(s);
                System.out.println(s+"Can be fitted in :");
                if(n<=127&& n>=-128)
                {
                    System.out.println("* byte");
                }
                if(n<=32767&& n>=-32768)
                {
                    System.out.println("* short");
                }
                if(n<=2147483647&& n>=-2147483648)
                {
                    System.out.println("* int");
                }
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(s+"Cant fit anywhere");
            }
        }
    }
}
