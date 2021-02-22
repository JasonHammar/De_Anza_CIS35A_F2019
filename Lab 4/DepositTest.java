package excercise1Part1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositTest {

	@Test
	void test() {
		SavingsAccount saver = new SavingsAccount();
		saver.setSavingsBalance(3000);
		saver.setSavingsBalance(saver.deposit(1000));
		double x = saver.getSavingsBalance();

		assertEquals(4000, x);
		// This method tests the deposit method and makes sure that money is added
		// to the savings balance.
	}

}
/*
 * Started by getting all of the values set. Tried making them all static, but
 * that ended up messing up the values, so I had to change them to public
 * doubles. I figured out that annual interest rate was static, so I had to
 * modify the program a bit. It still was setting the annual interest rate to
 * 5%, so I had to put in the for loop when i = 0, that the interest rate needs
 * to be at 4%. I used getters and setters to get the savings balance, and to
 * get the annual interest rate, and that way, I was able to make the program
 * work. I was able to find the problem with annual interest rate, and now it is
 * no longer static. The program now has the first month with 4% interest and
 * the second month at 5% interest. I had also tried to use int and float, but
 * those didn't work, so all of the variables are doubles. I realized that the
 * method wasn't being overridden, so I decided to put in a SavingsAccount
 * object.
 * 
 */