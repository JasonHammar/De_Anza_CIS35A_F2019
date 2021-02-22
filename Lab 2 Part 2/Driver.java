
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin quarter = new Coin();
		Coin dime = new Coin();
		Coin nickel = new Coin();
		Simulation s1 = new Simulation();
		s1.toss(quarter);
		s1.toss(dime);
		s1.toss(nickel);
	}

}

/*
 * I started by trying arrays, that didn't work, Tried to use ints, that worked
 * well. Moved main code to one class, was able to print out sufficient results.
 * I have not yet figured out how to use the methods the correct way yet, but I
 * am getting close. Found a way to print out values by returning heads and
 * tails int the coin class for the toss method. However, not all the values are
 * being printed out, as some might be null. Found out that you only need to 
 * call the method once, now all the results will successfully print out.
 */