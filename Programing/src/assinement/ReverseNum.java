package assinement;

public class ReverseNum
{
	public static int revNum(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem =n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	
	}
	public static void main(String[] args) 
	{
		System.out.println(revNum(358));
		
	}

}
