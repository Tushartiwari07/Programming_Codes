package assinement;

import java.util.Scanner;

public class HappyNumber 
{
	public static boolean isHappy(int n)
	{
		while(n>9)
		{
		int sum =0;
		while(n>0)
		{
			int rem =n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		    n=sum;
		}
	      return n==7||n==1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean res=isHappy(n);
		if(res==true)
		{
			System.out.println(n +" is a happy number");
		}
		else
		{
			System.out.println(n +" is not a happy number");
		}	
		sc.close();
	}

}
