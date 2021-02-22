import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TailsTest {

	String b;
	@Test
	void test() {
		
		
		Coin c = new Coin();
		
		// Testing to see if sideUp is Tails. Will either be heads or tails.
		
		String a = c.toss(b);
		assertEquals("Tails", a);
		
	}

}
