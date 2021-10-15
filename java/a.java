import java.util.Scanner;

public class a 
{
    private static Scanner obj;

    public static void main(String args[])
     {
         int a,b;
         System.out.println("enter two numbers");
         obj = new Scanner(System.in);
         a=obj.nextInt();
         b=obj.nextInt();
         int sum=a+b;
         System.out.println("sum of two numbers"+sum);

        
    }
}
