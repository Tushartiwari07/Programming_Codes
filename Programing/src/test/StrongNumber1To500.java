package test;


public class StrongNumber1To500
{
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static boolean isStrong(int n)
	{
	  int  orgNum =n;
	  int sum =0;
	  while(n>0)
	  {
		  int rem=n%10;
		  sum=sum+factorial(rem);
		  n=n/10;
	  }
	  if(orgNum==sum)	  
	  {
		  return true;
		  
	  }
	return false;
	}
	public static void main(String[] args)
	{
	   for(int i=1;i<=500;i++)
	   {
		   if(isStrong(i))
		   {
			   System.out.println(i);
		   }
	   }
	}

}
