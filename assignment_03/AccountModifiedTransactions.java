package assignment_03;

public class AccountModifiedTransactions 
{
	// -----------------------------------------------------------------
	// Creates some bank accounts and requests various services.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		AccountModified acct1 = new AccountModified("Ted Murphy", 72354, 102.56);
		AccountModified acct2 = new AccountModified("Jane Smith", 69713, 40.00);
		AccountModified acct3 = new AccountModified("Edward Demsey", 93757, 759.32);

		acct1.deposit(25.85);

		double smithBalance = acct2.deposit(500.00);
		System.out.println("Smith balance after deposit: " + smithBalance);
		smithBalance = acct2.deposit(-10.00);
		System.out.println("Smith balance after falied deposit: " + smithBalance);

		System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));
		smithBalance = acct2.withdraw(200.00, 2.00);
		System.out.println("Smith balance after falied withdraw: " + smithBalance);
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();

		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
	}
}
