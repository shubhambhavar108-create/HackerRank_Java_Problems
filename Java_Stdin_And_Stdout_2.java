import java.util.Scanner;

public class Java_Stdin_And_Stdout_2 
{
 
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d=scan.nextDouble();
        scan.nextLine(); // Enter consume karto
        String str = scan.nextLine();

        scan.close();
        
        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    
    }
}
   

