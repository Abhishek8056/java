 /* package codechef; // don't place package name! */

import java.util.*;
//import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{


	public static void main(String[] args)
	{
		// your code goes here
		Double t;
		Scanner obj= new Scanner(System.in);
		t= obj.nextDouble();

		while(t--);
		
		{
			double D,d,p,q;
	        Scanner obj=new Scanner(System.in);
			D=obj.nextDouble();
	     	d=obj.nextDouble();
		    p=obj.nextDouble();
		    q=obj.nextDouble();

			Double m=(double) 0;   
			int n=(int) (D/d);
			m+=(d*((n)*((2*p)+(n-1)*q)))/2;
			m+=(D%d)*(p+(n*q));
			System.out.println(m);

		}

	}
}
