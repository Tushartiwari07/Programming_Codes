package assinement;

import java.util.Scanner;

public class EmpIdCheck 
{
	public static boolean isPrime(int n)
	{
		if(n>1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void isValid(int id)
	{
		int sum=0;
		if(id>99999)
		{
			System.out.println("We can validate ");
			for(int i=1;i<=4;i++)
			{
				int rem=id%10;
				sum=sum+rem;
				id=id/10;
			}
		
		  boolean res=isPrime(sum);
		  if(res==true)
		  {
			  System.out.println(id +" EmpId is valid");
		  }
		  else
		  {
			  System.out.println(id +" EmpId is not valid");
		  }
		}
		else
		{
			System.out.println("Please Enter the valid Employee Id");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n =sc.nextInt();
		isValid(n);
		sc.close();
	}

}
