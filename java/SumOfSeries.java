public class SumOfSeries
{
 public static void main(String args[]) 
 {
     double sum=0;
     int i=1,j=0;
    System.out.println("the series is 1!+3!/2!+4!/3!+5!/4!+6!/5!");
    SumOfSeries obj=new SumOfSeries();

    while(i<6||j<=5)
    {
        sum=sum+(obj.fact(i)/obj.fact(j));
       i++; 
        j++;

    }
    sum=sum-(obj.fact(2));
    System.out.println("sum of series is"+sum);

 }
 
int fact(int x)
 {
     int mul=1;
     while(x>0)
     {
         mul=mul*x;
         x--;
     }
     return mul;
     
 }
     
 }