package assinement;

import java.util.Scanner;

public class PalindromeNum 
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
//		System.out.println(palindrome(151));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean result=palindrome(n);
		if(result==true)
//		{
			System.out.println(n+" is a palindrome number");
//		}
		else
//		{
			System.out.println(n+" is not a palindrome number");
//		}
		sc.close();
		
	}
}
