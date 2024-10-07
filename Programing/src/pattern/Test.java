package pattern;

public class Test 
{
	public static void main(String[] args)
	{
		int n=9;int st=1;;int sp=n/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("* ");
			}
			if(i<n/2+1)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();
		
		}
		
	}

}
