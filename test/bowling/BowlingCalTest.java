package bowling;

import junit.framework.TestCase;

public class BowlingCalTest extends TestCase {
	
	public void testCalculatorOneFrame() throws Exception {
		BowlingCal cal = new BowlingCal();
		
		int target = cal.run(1, 3, 4);
		assertEquals(7, target);
	}
	public void testCalculatorTwoFrameSpare() throws Exception {
		BowlingCal cal = new BowlingCal();
		
		cal.run(1, 9, 1);
		assertEquals(10, cal.frmScr[1]);
		cal.run(2, 8, 1);
		assertEquals(18,cal.frmScr[1]);
		assertEquals(27, cal.frmScr[2]);
	}
}

