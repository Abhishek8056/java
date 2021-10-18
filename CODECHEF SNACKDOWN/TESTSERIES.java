/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes hereng 
		int t;
			Scanner h=new Scanner(System.in);
				t=h.nextInt();
		while(t-->0)
		{
		     int a,i=0,e=0;
		    int im;
		    for(im=0;im<5;im++)
		    {
		        a=h.nextInt();
		        if(a==1)
		        i++;
		        else if(a==2)
		        e++;
		        
		    }
		    if(i>e)
		    System.out.println("INDIA");
		    else if (e>i)
		       System.out.println("ENGLAND");
		       else
		    System.out.println("DRAW");   
		}

	}
		
}
