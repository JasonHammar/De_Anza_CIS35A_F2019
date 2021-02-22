package excercise1part2;

import java.util.Scanner;

import excercise1Part1.SavingsAccount;

public class Driver {
	static SavingsAccount saver1 = new SavingsAccount();
	static SavingsAccount saver2 = new SavingsAccount();
	static SpecialSavings bigSaver = new SpecialSavings();

	static Scanner inp = new Scanner(System.in);
	private static boolean done = false;

	public static void main(String[] args) {
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);

		while (done == false) {

			bigSaver.withdrawOrDeposit(saver1, saver2);

			int keepGoing = inp.nextInt();
			if (keepGoing > 2 || keepGoing < 1) {
				boolean error = true;
				while (error == true) {
					System.out.printf("Invalid entry, please type in the correct number. \n"
							+ "If you would like to quit, please type in 1. \n"
							+ "If you would like to continue, please type in 2. \n");
					keepGoing = inp.nextInt();
					if (keepGoing <= 2 && keepGoing >= 1) {
						error = false;
					}
				}

			}
			if (keepGoing == 1) {
				System.out.printf("Thank you and goodbye!");
				break;
			}
		}
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
