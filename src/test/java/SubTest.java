import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubTest {
	@Test
	public void oneMinusOne() {
		assertEquals(0, Add.sub(1,1));
	}

	@Test
	public void threeMinus2() {
		assertEquals(1, Add.sub(3,2));
	}
}