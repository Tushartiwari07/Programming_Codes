package basic;

public class EvenUsingTernary 
{
	public static void test(int n)
	{
	  String res = (n%2==0)? "even number":"odd number";
	  System.out.println(res);
	}
	public static void main(String[] args) 
	{
		test(21);
		test(26);
	}

}
