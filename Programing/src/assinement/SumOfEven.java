package assinement;

import java.util.Scanner;

public class SumOfEven
{
	public static  int sumEven(int n)
	{
		int sum = 0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			n=n/10;
		}
		return sum;	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int res=sumEven(n);
		System.out.println(res);
		sc.close();
		
	}

}
