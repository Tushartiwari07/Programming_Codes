package assinement;

public class PrimeNumber
{
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
//		for(int i=2;i<=Math.sqrt(n);i++)
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
		for(int i=1;i<=100;i++)
		{
			boolean res=isPrime(i);
			if(res==true)
			{
				System.out.println(i +" ");
			}
		}
	
     }
	
}


