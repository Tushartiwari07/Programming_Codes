package assinement;

import java.util.Scanner;

public class ArmStrong 
{
	public static int countDigit(int n)
	{
		int count =0;
		while(n>0)
		{
			count++;
			n=n/10;
			
		}
		return count;
	}
	public static int power(int n ,int p)
	{
		int power=1;
		for(int i=1;i<=p;i++)
		{
			power=power*n;
		}
		return power;
	}
	public static boolean isArmStrong(int n)
	{
		int cd=countDigit(n);

		int orgNum=n;
		int sum =0;
		while(n>0);
		{
			int rem = n%10;
			int pow=power(rem, cd);
			sum= sum+pow;
			n=n/10;
			
		}
		return orgNum==sum;
	}
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the num to check the number is ArmStrong of not");
    	int n= sc.nextInt();
    	boolean res=isArmStrong(n);
    	if(res==true)
    	{
    		System.out.println(n +" is Armstrong number");	
    	}
    	else
    	{
    		System.out.println(n +" is not a Armstrong number");	
    	}
    	sc.close();
		
	}
	

}
