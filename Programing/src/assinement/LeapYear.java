package assinement;
public class LeapYear 
{
	public static void test(int year)
	{
		if(year%4==0&&year%100!=0)
		{
			System.out.println(year +" is leap year");
		}
		else if(year%400==0)
		{
			System.out.println(year + " is leap year");
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}
	public static void main(String[] args) 
	{
		test(2012);
	}
}
