package array;

public class UniqueElement 
{
	public static void main(String[] args) 
	{
		int x[]= {1,2,3,2,1};
		boolean b[]=new boolean[x.length];
		for(int i=0;i<=x.length-1;i++)
		{
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<=x.length-1;j++)
				{
					if(x[j]==x[i])
					{
						count++;
						b[j]=true;
					}
				}
//				if(x[i]==-1)
				System.out.println(x[i]+"---------"+count);
			}
		}

	}

}
