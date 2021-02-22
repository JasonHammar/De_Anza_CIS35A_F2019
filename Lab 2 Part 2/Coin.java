import java.util.Random;

public class Coin {
	Random coinToss = new Random();
	private String sideUp = null;
	int x;

	public Coin() {

		x = coinToss.nextInt(2);
		if (x == 1) {
			sideUp = "Heads";
		} else if (x == 0) {
			sideUp = "Tails";
		}

		getSideUp();

	}

	public void setSideUp(String sideUp) {
		this.sideUp = sideUp;
	}

	public String getSideUp() {

		return sideUp;

	}

	public String toss(String sideUp) {

		x = coinToss.nextInt(1 + 1);
		// nextInt();
		if (x == 1) {
			setSideUp(sideUp);
			return "Heads";
		} else if (x == 0) {
			setSideUp(sideUp);
			return "Tails";

		}
		getSideUp();
		return sideUp;
	}

	public int nextInt() {

		return x;

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
