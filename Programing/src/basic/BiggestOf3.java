package basic;

public class BiggestOf3
{
	public static void test(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println(a + " is the biggest number");
		}
		else if(b>c) 
		{
			System.out.println(b + " is the biggest number");
		}
		else 
		{
			System.out.println(c + " is the biggest number");
		}
	}
	public static void main(String[] args)
	{
		test(16,24,28);
		test(22, 31,29);
		test(30,29,27);
		
	}

}
