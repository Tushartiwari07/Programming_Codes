package test;

import java.util.Scanner;

public class PerfectNum 
{
	public static boolean perfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;	
	}
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number to check prime number");
		 int n=sc.nextInt();
		 if(perfect(n))
		 {
			 System.out.println(n+" is perfect number");
		 }
		 else
		 {
			 System.out.println(n+" is not a perfect number");
		 }
		 sc.close();
		
	}

}
