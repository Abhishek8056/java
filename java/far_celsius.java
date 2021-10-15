import java.util.Scanner;
public class far_celsius 
{
    //233private static Scanner obj;
    private static Scanner obj2;

    public static void main(String args[]) 
    {
       float celsius;
       System.out.println("enter temperture in celsius");
       
       obj2 = new Scanner(System.in);      
       celsius=obj2.nextFloat();
       float far =(celsius*9/5)+32;
       System.out.println("temperature in farehenhit"+far);

    }    
}
