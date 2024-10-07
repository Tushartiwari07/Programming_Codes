package assinement;

import java.util.Scanner;

public class StrongNumber 
{
	public static int factorial(int n)
	{
		
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;	
		}
		return fact;
	}
	public static boolean strong(int n)
	{
		int orgNum= n;
		int sum = 0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
		}
		return sum==orgNum;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	     System.out.println("enter the number");
	     int n=sc.nextInt();
	     boolean res=strong(n);
	     if(res==true)
	     {
	    	 System.out.println(n+" is a strong number");
	     }
	     else 
	     {
	    	 System.out.println(n+" is not strong number");
	    	 
	     }
	     sc.close();
	}

}
