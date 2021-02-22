
import java.util.Scanner;

public class interest {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		float balance = in.nextInt();
		float annualInterestRate = in.nextInt();
		int numberOfYears = in.nextInt();
		float monthlyPayment = 865;		
		float principal;
		float monthlyInterestRate = annualInterestRate / 12;
		float interest;
		//System.out.printf("Years 27d%");
		for(int i = 1; i <= numberOfYears * 12; i++) {
			interest = (monthlyInterestRate * balance) / 100;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		
		}
	}

}
/*
 * In this program, I am testing loops that will allow me to determine the monthly payment 
 * by using loops, read in values, and many other things. 
 * I tried to test all my variable by making them integers, but that didn't work
 * because the interest kept showing up as 0.0.
 * I tried long and float, and so far, float is working better.
 * I tested different ways to get the interest because it is a percentage, so I 
 * had to divide it by 100.
 * I'm able to get good values, but the decimal places are all over the place,
 * they go to seven places, and I haven't figured out how to get them to two places.
 */
