package excercise1part2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateMonthlyInterestOverrideTest {
	SpecialSavings saver = new SpecialSavings();

	@Test
	void test() {

		saver.setSavingsBalance(4111);
		double x = saver.calculateMonthlyInterest(saver);

		assertEquals(4124.703333333333, x);
		// this method tests to make sure that the calculate monthly interest method is
		// overridden in the Special Savings class. Can be modified for different
		// numbers.
	}

}
/*
 * I first started by setting up all of my values. I crested two savers, saver 1
 * and saver 2, and set their savings balances to the required numbers. I
 * created a user interface, to make it easier to run the program and find
 * errors. I set up a calculate monthly interest method in the Special Savings
 * class that overrides the one in the Savings Account class. I realized that a
 * lot of my variables and methods were static, so I had to change them back to
 * normal in order to get the correct values. I found the the calculate monthly
 * interest method in the child class wasn't overriding the parent method
 * because the parent method didn't have any values being entered into it.
 * 
 * 
 */