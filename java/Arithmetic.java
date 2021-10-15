import java.util.Scanner;

public class Arithmetic
 {
      private static Scanner obj3;

      public static void main(String args[]) 
     {
        int a,b;
        System.out.println("enter two numbers...");
        obj3 = new Scanner(System.in);
        a=obj3.nextInt();
        b=obj3.nextInt();
        System.out.println("Adittion"+(a+b));

     }
}
