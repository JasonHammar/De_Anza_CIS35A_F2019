import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfoTest {
	int w = 0;
	String x = null;
	long y = 0;
	String z = null;
	@Test
	void test() {
		PersonalInformation a = new PersonalInformation(w, x, y, z);
		// This test checks to make sure that all four pieces of information
		// are asked of the user. 
		Driver b = new Driver();
		b.input(a);
		int result = b.getCounter();
		assertEquals(4, result);
	}

}
