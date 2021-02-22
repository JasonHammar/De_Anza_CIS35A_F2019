import java.util.*;

public class Driver {
	static Scanner inp = new Scanner(System.in);
	static String info;
	static int num;
	static long longnum;
	public int counter = 0;
	public void input(PersonalInformation jason) {
		info = null;
		num = 0;
		longnum = 0;
		System.out.printf("What is your name? ");
		info = inp.nextLine();
		jason.setName(info);
		counter++;
		System.out.printf("What is your address? ");
		info = inp.nextLine();
		jason.setAddress(info);
		counter++;
		System.out.printf("What is your phone number? ");
		longnum = inp.nextLong();
		jason.setPhone(longnum);
		counter++;
		System.out.printf("How old are you? ");
		num = inp.nextInt();
		jason.setAge(num);
		counter++;
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		PersonalInformation jason = new PersonalInformation(num, info, longnum, info);
		d.input(jason);
		jason.print();

	}
	public int getCounter() {
		return counter;
	}

}

/*
 * Started out with code from online class, used getters and setters to get all
 * necessary information from the driver class. At first it didn't work, but
 * then I put the print statements in the public human method. Human method gets
 * the information from the driver class, and the human class is able to print
 * it out. address and phone number have to be strings, too long of an int.
 * Looked back at what we learned in class, made print method, and input method
 * as well. For some reason, it will only print out 3 pieces of information,
 * rather than all four. Found a way to print all four, put the strings first, and the ints later.
 * Haven't found a way to print out phone number. Put phone number as a string, and age as an int,
 * Everything else is a string. Prints everything out in straight line.
 * Results are no able to be printed in straight line by using \n in the 
 * printf statements. Changed phone number to a long in order to print out 
 * all of the numbers in the phone number.
 */
