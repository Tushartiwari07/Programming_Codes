package assinement;

import java.util.Scanner;

public class SpyNum 
{
	//sum of all the digits is equal to the product of all digit
	public static boolean spy(int n)
	{
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+pro;
			pro=pro*rem;
			n=n/10;
		}
		return sum==pro;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean result=spy(n);
		if(result==true)
		{
			System.out.println(n+" is a Spy number");
		}
		else
		{
			System.out.println(n+"  is not Spy number");

		}
		sc.close();
		
	}

}
