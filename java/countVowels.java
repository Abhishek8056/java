import java.util.Scanner;
public class countVowels
  {
   private static Scanner s;

public static void main(String args[]){
       System.out.println("Enter the String");
       s = new Scanner(System.in);
       String a=s.nextLine();
       int cnt=0;
        for(int i=0;i<a.length();i++)
            {
                char ch=a.charAt(i);
               if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
                  cnt++;  
            }
         System.out.println("The number of vowels in the text are :"+cnt);   
       
   }
}