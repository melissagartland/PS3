package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	
	public void test() {
		Account checking = new Account(20000);
		checking.setAccountNumber(1122);
		try
		{
			System.out.println("Withdrawing $3000");
			checking.deposit(3000);
			System.out.println("Withdrawing $2500");
			checking.withdraw(2500);
		}catch(InsufficientFundsException e)
		{
			System.out.println("Account needs " + e.getAmount() + "to make that withdraw.");
			e.printStackTrace();
		}
	}

}
