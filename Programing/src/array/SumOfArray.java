package array;

public class SumOfArray 
{
	public static void main(String[] args)
	{
		int sum=0;
		int x[]= {10,15,20,25};
		for(int i=0;i<=x.length-1;i++)
		{
			sum=sum+x[i];
			if(x[i]%2==0)
			{
				System.out.println(x[i]);
			}
		}
		System.out.println(sum);		
	}

}
