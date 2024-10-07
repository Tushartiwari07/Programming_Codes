package array;

import java.util.Scanner;

public class PerfectArray 
{
	public static boolean perfectNum (int n)
	//except the number sum of the factors should be equal to the entered number
	{
		int sum =0;
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
			boolean res = perfectNum(x[i]);
			if(res==true)
				System.out.println(x[i]+" is the perfect number");
			
		}
		
	}

}
