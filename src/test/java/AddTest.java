import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {
	@Test
	public void onePlusOne() {
		assertEquals(2, Add.add(1,1));
	}

	@Test
	public void onePlusTwo() {
		assertEquals(3, Add.add(1,2));
	}
}
