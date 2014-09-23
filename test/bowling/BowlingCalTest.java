package bowling;

import junit.framework.TestCase;


public class BowlingCalTest extends TestCase {
	
	BowlingCal cal;
	
	public void setUp() {
		cal = new BowlingCal();
	}
	// total Score
	public void testAllPinPointZero() throws Exception {
		for (int nth = 0; nth < 20; nth++)
			cal.savePinPoint(0);
		assertEquals(0, cal.scoreCal());
	}
	public void testAllPinPointOne() throws Exception {
		for (int nth = 0; nth < 20; nth++)
			cal.savePinPoint(1);
		assertEquals(20, cal.scoreCal());
	}
	
	// testSpare
	public void testOneFrameSpare() throws Exception {
		cal.savePinPoint(5);
		cal.savePinPoint(5);
		cal.savePinPoint(5);
		
		assertEquals(20, cal.scoreCal());
	}
	public void testTwoFrameSpare() throws Exception {
		cal.savePinPoint(5); // 5
		cal.savePinPoint(3); // 8
		cal.savePinPoint(5); // 13
		cal.savePinPoint(5); // 19
		cal.savePinPoint(1); // 20
		
		assertEquals(20, cal.scoreCal());
	}
	public void testFrameTwoSpare() throws Exception {
		cal.savePinPoint(5); // 5
		cal.savePinPoint(3); // 8
		cal.savePinPoint(5); // 13
		cal.savePinPoint(5); // 19
		cal.savePinPoint(1); // 20
		cal.savePinPoint(9); // 33
		cal.savePinPoint(4); // 37
		
		assertEquals(37, cal.scoreCal());
	}
	public void testOneFrameStrike() throws Exception {
		cal.savePinPoint(10); // 17
		cal.savePinPoint(0);
		cal.savePinPoint(3); // 20
		cal.savePinPoint(4); // 24
		
		
		assertEquals(24, cal.scoreCal());
	}
	
}

