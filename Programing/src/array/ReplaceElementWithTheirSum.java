package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementWithTheirSum {
	public static int sum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int x[] = new int[size];
		System.out.println("enter " + size + " array to the elements");
		for (int i = 0; i <= x.length - 1; i++) {
			x[i] = sc.nextInt();
		}
		for(int i=0;i<=x.length-1;i++)
		{
			int replace =sum(x[i]);
			x[i]=replace;
			System.out.println(x[i]);
		}
		System.out.println(Arrays.toString(x));

	}

}
