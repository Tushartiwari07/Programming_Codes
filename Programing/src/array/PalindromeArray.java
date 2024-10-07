package array;

import java.util.Scanner;

public class PalindromeArray 
{
	public static boolean palindrome(int n)
	{
		int org=n;
		int rev=0;
		while(n>0)
		{
			int rem =n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		 return rev==org;
		
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
			boolean res = palindrome(x[i]);
			if(res==true)
				System.out.println(x[i]+"cis the palindrome number");
			
		}
		
	}

}
