package test;

import java.util.Scanner;

public class SumOfOdd 
{
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
			}
			n=n/10;
		}	
		return  sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	      System.out.println("enter the number");
	      int n=sc.nextInt();
	      System.out.println(sum(n));
		sc.close();
	}
}
