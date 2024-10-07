package basic;

public class EvenWithModulo
{
	public static void test(int n)
	{
		if(n%2==0)
		{
			System.out.println(n +" is even number");
		}
		else
		{
			System.out.println(n +" is odd number");
		}
	}
	public static void main(String[] args) 
	{
		test(26);
		test(21);
		

	}

}
