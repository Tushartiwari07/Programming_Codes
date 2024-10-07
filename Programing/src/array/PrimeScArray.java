package array;

import java.util.Scanner;

public class PrimeScArray 
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
	  for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new  Scanner(System.in);
		System.out.println("Enter the size of arry");
		int size=sc.nextInt();
		int x[]=new int[size];
		System.out.println("enter "+size+" elements to the aray");
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		
		for(int i=0;i<=x.length-1;i++)
		{
			boolean res = isPrime(x[i]);
			if(res==true)
				System.out.println(x[i]+"is the prime number");
			
		}
	

				
		
	}

}
