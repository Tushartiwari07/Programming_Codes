package pattern;

public class Star 
{
	public static void main(String[] args) 
	{
		int n=7;
		int mid=n/2+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n ;j++)
			{
				if(i==1||i==mid||j==mid)
				System.out.print("*  ");
			}

			System.out.println();
		}
		
	}

}
