import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfFlipsTest {
Coin c = new Coin();
	@Test
	void test() {
		Simulation test = new Simulation();
		test.toss(c);
		int a = test.getCount();
		assertEquals(20, a);
		// Tests to see that the coin flips 20 times.
	}

}
