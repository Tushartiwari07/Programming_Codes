package basic;

public class EvenUsingSwitch 
{
	public static void test(int n)
	{
		switch(n%2)
		{
		case 0:
		System.out.println(n + " number is even");
		break;
		case 1:
		System.out.println(n + " number is odd");
		break;
		
		}
	}
	public static void main(String[] args) 
	{
		test(15);
		test(22);

	}

}
