package array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray 
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
		System.out.println("Enter the size of second array");
		int size1 = sc.nextInt();
		int y[]=new int[size1];
		System.out.println("Enter "+size1+" elements to array");
		for(int i=0;i<=y.length-1;i++)
		{
			y[i]=sc.nextInt();
		}
		int[] mergedArray = megre(x, y);
		System.out.println(Arrays.toString(mergedArray));
	}
	public static int[] megre(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		for(int i=0;i<=x.length-1;i++)
		{
			z[i]=x[i];
		}
		for(int i=0;i<=y.length-1;i++)
		{
			z[x.length+i]=y[i];
		}
		return z;
	}

}
