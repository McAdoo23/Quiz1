import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account c;
	double balance;
	double deposit;
	@Before
	public void setUp() throws Exception {
		c = new Account(1122, 20000, 0.045) ;
		
		
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}
	

	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		c.deposit(500.00);
		assertEquals("$400 Expected, actual is $500",(long)c.getbalance(),(long)500.00);
       c.withdraw(900);
	}
	@Test
	public final void testDeposit() {
		int x = 0;
		
		while (x < 20) {
			c.deposit(1000000000);
		}
	}
	@Test 
	public final void deposit(){
		balance  += deposit;
		//return balance;	
	}}


