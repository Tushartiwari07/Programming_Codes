package array;

import java.util.Scanner;

public class LenearSearch 
{
	public static void lenearSearch(int []n)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number to search");
		 int num=sc.nextInt();
		 for(int i=0;i<=n.length-1;i++)
			 {
				 if(n[i]==num)
				 {
					 System.out.println(num+" is present in "+i +" index");
					 break;
				 } 
			 }
	}
	
	
	
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
		
		 lenearSearch(x);
//		 for(int i=0;i<=x.length-1;i++)
//		 {
//			 lenearSearch(x[i]);
//			 for(int j=i+1;j<=x.length-1;j++)
//			 {
//				 if()
//			 }
//			 if(x[i]==num)
//			 {
//				 System.out.println(num+" is present in "+i +" index");
//				 break;
//			 }		 
		 }
	}
