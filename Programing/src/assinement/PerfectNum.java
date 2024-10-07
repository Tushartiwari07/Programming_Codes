package assinement;
import java.util.Scanner;

public class PerfectNum
{
	public static boolean perfectNum (int n)
	//except the number sum of the factors should be equal to the entered number
	{
		int sum =0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;
     }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
			int n=sc.nextInt();
			boolean res = perfectNum(n);
			if(res==true)
		{
			System.out.println(n+"  is a perfect number");
		}
		else
		{
			System.out.println(n+"  is not a perfect number");
		}
			sc.close();
	}

}
