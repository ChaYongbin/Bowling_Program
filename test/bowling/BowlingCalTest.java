package bowling;

import junit.framework.TestCase;

public class BowlingCalTest extends TestCase {
	
	public void testCalculatorOneFrame() throws Exception {
		BowlingCal cal = new BowlingCal();
		
		int target = cal.run(1, 3, 4);
		assertEquals(7, target);
	}
	public void testCalculatorTwoFrame() throws Exception {
		BowlingCal cal = new BowlingCal();
		
		int target = cal.run(1, 3, 4);
		assertEquals(7, target);
		
		target = cal.run(2, 1, 8);
		assertEquals(16 , target);
	}
	public void testCalculatorFullFrame() throws Exception {
		BowlingCal cal = new BowlingCal();
		
		int target = cal.run(1, 3, 4);
		assertEquals(7, target);
		
		target = cal.run(2, 1, 8);
		assertEquals(16 , target);
		
		target = cal.run(3, 7, 1);
		assertEquals(24, target);
		
		target = cal.run(4, 9, 0);
		assertEquals(33, target);
		
		target = cal.run(5, 0, 0);
		assertEquals(33, target);
		
		target = cal.run(6, 8, 0);
		assertEquals(41, target);
		
		target = cal.run(7, 8, 1);
		assertEquals(50, target);
		
		target = cal.run(8, 1, 0);
		assertEquals(51, target);
		
		target = cal.run(9, 2, 3);
		assertEquals(56, target);
		
		target = cal.run(10, 4, 1);
		assertEquals(61, target);
	}
	
}

