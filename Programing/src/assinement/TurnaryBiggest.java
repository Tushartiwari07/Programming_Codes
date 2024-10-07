package assinement;

public class TurnaryBiggest 
{
	public static void test(int a, int b, int c ,int d)
	{
		int res=(a>b&&a>c&&a>d)? a:(b>c&&b>d)? b:(c>d)?c:d;
		System.out.println(res + " is the biggest num");
		 
	}
	public static void main(String[] args) 
	{
		test(99,24,64,54);
		test(11,86,54,76);
		test(69,94,96,84);
		test(25,24,65,69);
	}
	

}