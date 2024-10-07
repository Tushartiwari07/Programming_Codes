package assinement;
class Account
{
	double bal=15000.00;
	public void withdraw(double amt)
	{
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println("Current bal "+bal);
		}
		else
		{
			System.out.println("insufficient bal ");
		}
	}
}
public class Customer
{
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		a1.withdraw(2000);
		a1.withdraw(14000);
		
		
	}
	

}
