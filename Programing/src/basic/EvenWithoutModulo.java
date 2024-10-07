package basic;

public class EvenWithoutModulo
{
	public static void test(int n)
	{
		if(n/2*2==n)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
	}

	public static void main(String[] args) 
	{
		test(39);
		test(32);

	}

}
