package basic;

public class Palindrome1to500 
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
		for(int i=1;i<=500;i++)
		{
			boolean res=palindrome(i);
			if(res==true)
			{
				System.out.println(i);
			}
		}
		
	}

}
