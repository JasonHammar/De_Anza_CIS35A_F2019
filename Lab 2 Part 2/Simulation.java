
public class Simulation {
	int a = 0;
	public int count = 0;
	int b = 0;

	String sideUp = null;
	int x = 0;

	public void toss(Coin c) {

		for (int i = 1; i <= 20; i++) {

			if (c.toss(sideUp) == "Heads") {
				a++;
			} else {
				b++;
			}
			count = i;
		}

		System.out.printf("Heads: %d\n", a);
		System.out.printf("Tails: %d\n", b);

		a = 0;
		b = 0;

	}
	public int getCount() {
		return count;
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
