package array;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int x[]=new int[size];
		System.out.println("Enter "+size+" array elements");
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=i+1;j<=x.length-1;j++)
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
