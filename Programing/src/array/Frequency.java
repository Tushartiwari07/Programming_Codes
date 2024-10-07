package array;

import java.util.Scanner;

public class Frequency {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int x[]=new int[size];
		System.out.println("enter "+size+ " array to the elements");
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		boolean b[]=new boolean[x.length];
		for(int i=0;i<=x.length-1;i++)
		{
			if(b[i]==false)
			{
			int count=1;
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]==x[j])
				{
					count++;
					b[j]=true;
				}
			}
			System.out.println(x[i]+" is present "+count+" times");
		   }
		}
	}

}
