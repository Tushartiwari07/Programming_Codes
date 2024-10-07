package array;

import java.util.Scanner;

public class PairElementSum_isEqualToUserEnteredNumber 
{
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
		System.out.println("enter the sum value");
		int sum=sc.nextInt();
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]+x[j]==sum)
				{
					System.out.println(x[i]+" "+x[j]);
				}
			}
		}
	}

}
