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
	public void testOneFrameDoubleStrike() throws Exception {
		cal.savePinPoint(10); // 24
		cal.savePinPoint(0); // 24
		cal.savePinPoint(10); // 39 
		cal.savePinPoint(0); // 
		cal.savePinPoint(4); // 43
		cal.savePinPoint(1); // 44
		cal.savePinPoint(2); // 46
		
		assertEquals(46, cal.scoreCal());
	}
	public void testOneFrameTripleStrike() throws Exception {
		cal.savePinPoint(10); // 30
		cal.savePinPoint(0); // 30
		cal.savePinPoint(10); // 52
		cal.savePinPoint(0); // 52
		cal.savePinPoint(10); // 66
		cal.savePinPoint(0); // 66
		cal.savePinPoint(2); // 68
		cal.savePinPoint(2); // 70
		
		assertEquals(70, cal.scoreCal());
	}
	public void testFullFrame() throws Exception {
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(4); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(2); // 
		cal.savePinPoint(8); // 
		cal.savePinPoint(4); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(4); //
		
		assertEquals(144, cal.scoreCal());
	}
	public void testBonusFrameWhenSpare() throws Exception {
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(4); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(2); // 
		cal.savePinPoint(8); // 
		cal.savePinPoint(4); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(9); //
		cal.savePinPoint(4); //
		
		assertEquals(158, cal.scoreCal());
	}
	public void testBonusFrameWhenStrike() throws Exception {
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(4); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(2); // 
		cal.savePinPoint(8); // 
		cal.savePinPoint(4); // 
		cal.savePinPoint(1); // 
		cal.savePinPoint(9); // 
		cal.savePinPoint(1); //
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); //
		cal.savePinPoint(4); //
		
		assertEquals(162, cal.scoreCal());
	}
	public void testFullStrike() throws Exception {
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(0); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(10); // 
		cal.savePinPoint(10); //
		
		
		assertEquals(300, cal.scoreCal());
	}
}
