package test;

import java.util.Scanner;

public class ArmStrong 
{
   public static int countD(int n)
   {
	   int count=0;
	   while(n>0)
	   {
		   int rem=n%10;
		   count++;
		   n=n/10;
	   }
	   return count;
  }
   public static int power(int n, int p)
   {
	   int power=1;
	   for(int i=n;i<=p;i++)
	   {
		   power=power*n;
	   }
	   return power;
   }
   public static boolean isArmStrong(int n)
   {
	   int cd=countD(n);
	   int orgNum=n;
	   int sum=0;
	   while(n>0)
	   {
		   int rem =n%10;
		   int pow=power(rem, cd);
		   sum=sum+pow;
		   n=n/10;  
	   }
	   return orgNum==sum;
   }
   public static void main(String[] args) 
   {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the number to check armstrong number");
	   int n=sc.nextInt();
	   if(isArmStrong(n))
	   {
		   System.out.println(n+" is ArmStrong number");
	   }
	   else 
	   {
		   System.out.println(n+" is not ArmStrong number");
	   }
	   sc.close();
   }

}
