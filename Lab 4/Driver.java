package excercise1Part1;

public class Driver {
	static int x = 0;

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setSavingsBalance(3000);

		saver2.setSavingsBalance(2000);
		System.out.printf("Balance for first month for the first saver: ");

		for (int i = 0; i < 2; i++) {

			if (i == 1) {
				saver1.modifyInterestRate(0.05);
				System.out.printf("Balance for second month for the first saver: ");
			}
			saver1.setSavingsBalance(saver1.calculateMonthlyInterest(saver1));
			// Calculates the monthly interest for the first two months for saver 1. It will
			// change the annual interest rate from 4 percent to 5 percent when the second
			// month comes around.
		}

		System.out.printf("Balance for first month for the second saver: ");
		for (int i = 0; i < 2; i++) {

			if (i == 1) {
				saver2.modifyInterestRate(0.05);
				System.out.printf("Balance for second month for the second saver: ");
			}
			saver2.setSavingsBalance(saver2.calculateMonthlyInterest(saver2));
			// Calculates the monthly interest for the first two months for saver 2. It will
			// change the annual interest rate from 4 percent to 5 percent when the second
			// month comes around.
		}

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
