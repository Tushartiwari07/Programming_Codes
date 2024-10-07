package basic;

public class SmallestOf3UsingTernary 
{
	public static void test(int a, int b, int c)
	{
		int res=(a<b&&a<c)? a:(b<c)? b:c;
		System.out.println(res + " is smallest number");
	}
	public static void main(String[] args) 
	{
		test(11, 26, 24);
		
	}

}
