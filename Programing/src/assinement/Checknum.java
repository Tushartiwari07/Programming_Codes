package assinement;
class Check
{
	public void test(int num)
	{
		if(num%3==0 && num%5==0)
		{
			System.out.println("Sanju Mathu Geeta");
		}
		else if(num%5==0)
		{
			System.out.println("Geeta");
		}
		else if(num%3==0)
		{
			System.out.println("Sanju");
		}
		else
		{
			System.out.println("Breakup");
		}
	}
}
public class Checknum 
{
	public static void main(String[] args) 
	{
		Check c1 = new Check();
		c1.test(21);
		c1.test(10);
		c1.test(30);
		c1.test(2);
		
		
		
	}

}
