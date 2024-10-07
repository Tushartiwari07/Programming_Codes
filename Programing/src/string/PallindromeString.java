package string;

import java.util.Scanner;

public class PallindromeString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		if(isPallindrome(str))
			System.out.println(str+" is pallindrome");
		else
			System.out.println(str+" is not pallindrome");
	}
	public static boolean isPallindrome(String str)
	{
		int i=0; int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{	
				return false;
			}
				i++;
				j--;	
		}
		return true;
	}

}
