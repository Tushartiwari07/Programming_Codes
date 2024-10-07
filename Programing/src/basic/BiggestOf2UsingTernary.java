package basic;

public class BiggestOf2UsingTernary 
{
	public static void test(int a, int b)
	{
		int res=(a>b)? a:b;
		System.out.println(res + " is the biggest number");
	}

	public static void main(String[] args)
	{
		test(64,24);
		test(24,26);
		

	}

}
