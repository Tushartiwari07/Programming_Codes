package assinement;

public class BiggestnumOnlyIf
{
	public static void test(int a, int b , int c)
	{
		if(a>b&&a>c)
		{
			System.out.println(a + " is the biggest number");
		}
		if(b>c&&b>a)
		{
			System.out.println(b + " is the biggest number");
		}
		if(c>b&&c>a)
		{
			System.out.println(c + " is the biggest number");
		}
	}

	public static void main(String[] args) 
	{
		test(10,15,24);
		test(24,65,26);
		test(69,15,11);

	}

}
