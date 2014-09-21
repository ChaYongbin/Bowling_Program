package bowling;

import junit.framework.TestCase;

public class BowlingCalTest extends TestCase {
	public void testSpare() throws Exception {
		BowlingCal cal = new BowlingCal();
		cal.fallPins(9);
		cal.fallPins(1);
		cal.fallPins(8);
		cal.fallPins(1);
		cal.fallPins(0);
		cal.fallPins(5);
		cal.fallPins(0);
		cal.fallPins(10);
		cal.fallPins(1);
		cal.fallPins(4);
		cal.fallPins(5);
		cal.fallPins(2);
		cal.fallPins(9);
		cal.fallPins(1);
		cal.fallPins(3);
		cal.fallPins(4);
		cal.fallPins(0);
		cal.fallPins(10);
		cal.fallPins(1);
		cal.fallPins(8);
		
		int goal = cal.frameScore(0);
		assertEquals(18, goal);
		
		goal = cal.frameScore(1);
		assertEquals(27, goal);
		
		goal = cal.frameScore(2);
		assertEquals(32, goal);
		
		goal = cal.frameScore(3);
		assertEquals(43, goal);
		
		goal = cal.frameScore(4);
		assertEquals(48, goal);
		
		goal = cal.frameScore(5);
		assertEquals(55, goal);
		
		goal = cal.frameScore(6);
		assertEquals(68, goal);
		
		goal = cal.frameScore(7);
		assertEquals(75, goal);
		
		goal = cal.frameScore(8);
		assertEquals(86, goal);
		
		goal = cal.frameScore(9);
		assertEquals(95, goal);
		
		goal = cal.sumFrameScore();
		assertEquals(95, goal);
		
	}
}

