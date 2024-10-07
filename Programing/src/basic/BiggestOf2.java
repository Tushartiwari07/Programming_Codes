package basic;

public class BiggestOf2 
{
	public static void test(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a +" is the biggest number");
		}
		else
		{
			System.out.println(b +" is the biggest number");
		}
	}

	public static void main(String[] args) 
	{
		test(10,26);
		test(57,15);
	}	
}
