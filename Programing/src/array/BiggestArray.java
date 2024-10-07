package array;
import java.util.Arrays;
import java.util.Scanner;

public class BiggestArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size = sc.nextInt();
		int x[]=new int[size];
		System.out.println("Enter "+size+" elements to array");
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=1;j<=x.length-1;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		
	}
	
}
