package assinement;

import java.util.Scanner;

public class SumFactor 
{
	public static int sumfat(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		sum=sum+n;

		return sum;
	}
	public static void main(String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the number");
	     int n =sc.nextInt();
	     System.out.println(sumfat(n));
	      sc.close();	}

}
