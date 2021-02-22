import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimulationTest {
String b;
	@Test
	void test() {
		
		
		Coin c = new Coin();
		
		// Testing to see if sideUp is heads. Will either be heads or tails.
		
		String a = c.toss(b);
		assertEquals("Heads", a);
		
	}

}
