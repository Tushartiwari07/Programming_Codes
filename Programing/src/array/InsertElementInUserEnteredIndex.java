package array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInUserEnteredIndex 
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
		System.out.println("Enter the Element to insert");
		int ele=sc.nextInt();
		System.out.println("Enter the index value to insert");
		int ind=sc.nextInt();
		int z[]=insert(x, ele, ind);
		if(z!=null)
		{
			System.out.println(Arrays.toString(z));
		}
		else
		{
			System.out.println("invalid index");
		}
		
	}
	public static int[] insert(int x[],int ele,int ind)
	{
		int y[]=new int[x.length+1];
		y[ind]=ele;
		for(int i=0;i<=x.length-1;i++)
		{
			if(i<ind)
			{
				y[i]=x[i];
			}
			else
			{
				y[i+1]=x[i];
			}
		}
		return y;
	}

}
