package assinement;

import java.util.Scanner;

public class FactorNum
{
	public static void printFactor(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		printFactor(n);
		sc.close();
		
	}

}
