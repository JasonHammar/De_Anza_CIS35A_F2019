package excercise1Part1;

import java.util.Scanner;

public class SavingsAccount {

	Scanner inp = new Scanner(System.in);
	private double savingsBalance;
	private double annualInterestRate = 0.04;

	// Variables given to the class.
	public double calculateMonthlyInterest(SavingsAccount saver) {

		double newBalance = (savingsBalance * getAnnualInterestRate()) / 12;

		savingsBalance = newBalance + savingsBalance;

		System.out.println(savingsBalance);

		return savingsBalance;

		// This method will calculate the monthly interest for saver and add the monthly
		// interest to the savings balance.
	}

	public double getSavingsBalance() {
		return savingsBalance;
		// gets the value of the savings balance.
	}

	public double modifyInterestRate(double modified) {
		setAnnualInterestRate(modified);
		return modified;
		// changes the interest rate to value given to the method.
	}

	public double setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
		return savingsBalance;
		// sets the savings balance to the value given to the method.
	}

	public double withdrawal(double withdrawal) {

		double newBalance = savingsBalance - withdrawal;
		return newBalance;
		// subtracts money from the savings balance which is given by the user.
	}

	public double deposit(double deposit) {
		double newBalance = savingsBalance + deposit;
		return newBalance;
		// Adds money into the savings balance which is given by the user.
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
		// gets the annual interest rate value.
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		// sets the annual interest rate to a value given to the method.
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