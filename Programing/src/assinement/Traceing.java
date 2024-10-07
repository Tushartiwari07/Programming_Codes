package assinement;

public class Traceing 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<+10;j++)
			{
				if(j==3)
				{
					break;
				}
				System.out.println(j +" innerLoop");
			}
			System.out.println(i);
		}
		
	}

}
