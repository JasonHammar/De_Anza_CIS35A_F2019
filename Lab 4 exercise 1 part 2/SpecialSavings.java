package excercise1part2;

import java.util.Scanner;

import excercise1Part1.SavingsAccount;

public class SpecialSavings extends SavingsAccount {
	static Scanner inp = new Scanner(System.in);
	static private boolean error = true;
	private static double total = 0;
	static private double total1 = 0;
	static private double total2 = 0;

	// Variables for this class.
	public SavingsAccount withdrawOrDeposit(SavingsAccount saver1, SavingsAccount saver2) {

		System.out.printf(
				"If you would like to make a deposit, please press 1, if you would like to make a withdrawal, please press 2. \n");
		int withdrawOrDeposit = inp.nextInt();
		if (withdrawOrDeposit < 1 || withdrawOrDeposit > 2) {
			while (error) {
				System.out.printf(
						"Invalid entry, if you would like to make a deposit, please press 1, if you would like to make a withdrawal, please press 2. \n");
				withdrawOrDeposit = inp.nextInt();
				if (withdrawOrDeposit == 1 || withdrawOrDeposit == 2) {
					error = false;
				}
			}
		}
		if (withdrawOrDeposit == 1) {
			System.out.printf("Saver 1, how much money would you like to deposit? \n");
			double balance = inp.nextInt();
			System.out.printf("Money deposited for saver1: %f\n", balance);
			total1 = saver1.deposit(balance);
			System.out.printf("Current balance: %f", saver1.setSavingsBalance(total1));

			total = calculateMonthlyInterest(saver1);
			System.out.printf("\nBalance with monthly interest added: %f", total);
			saver1.setSavingsBalance(total);

			System.out.printf("\nSaver 2, how much money would you like to deposit? \n");
			balance = inp.nextInt();
			System.out.printf("Money deposited for saver 2: %f\n", balance);
			total1 = saver2.deposit(balance);
			System.out.printf("Current balance: %f", saver2.setSavingsBalance(total1));

			total = calculateMonthlyInterest(saver2);
			System.out.printf("\nBalance with monthly interest added: %f", total);
			saver2.setSavingsBalance(total);

			System.out
					.printf("\nIf you would like to quit, please press 1, otherwise, press any number to continue. \n");

		} else if (withdrawOrDeposit == 2) {
			System.out.printf("Saver 1, how much money would you like to withdraw? \n");
			double balance = inp.nextInt();
			System.out.printf("Money withdrawn for saver1: %f\n", balance);
			total1 = saver1.withdrawal(balance);
			System.out.printf("Current balance: %f", saver1.setSavingsBalance(total1));
			total = calculateMonthlyInterest(saver1);
			System.out.printf("\nBalance with monthly interest added: %f", total);
			saver1.setSavingsBalance(total);

			System.out.printf("\nSaver 2, how much money would you like to withdraw? \n");
			balance = inp.nextInt();
			System.out.printf("Money withdrawn for saver 2: %f\n", balance);
			total1 = saver2.withdrawal(balance);
			System.out.printf("Current balance: %f", saver2.setSavingsBalance(total1));
			total = calculateMonthlyInterest(saver2);
			System.out.printf("\nBalance with monthly interest added: %f", total);
			saver2.setSavingsBalance(total);

			System.out.printf("\nIf you would like to quit, please press 1, otherwise, press 2 to continue. \n");

		}
		return saver1;
		// this method asks the user if they want to withdraw or deposit, and then the
		// user has to enter how much they want to withdraw or deposit. If they want to
		// keep depositing or withdrawing, the program gives them that option as well.
	}

	public double calculateMonthlyInterest(SavingsAccount saver) {
		double balance = saver.getSavingsBalance();
		if (balance > 10000) {
			saver.modifyInterestRate(0.1);
		} else if (balance <= 10000) {
			saver.modifyInterestRate(0.04);
		}
		double newBalance = (balance * saver.getAnnualInterestRate()) / 12;

		balance = newBalance + balance;

		return balance;
		// this method overrides the calculate monthly interest method in the savings
		// account class. It will set the annual interest rate to 10% if the balance is
		// over $10000, and to 4% if under.
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