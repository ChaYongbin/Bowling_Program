package bowling;

public class BowlingCal {
	
	int[] frmScr;
	
	BowlingCal() {
		frmScr = new int[11];
	}
	
	public int run(int frm, int oneBall, int twoBall) {
		frmScr[frm] = frmScr[frm - 1] + oneBall + twoBall;	
		return frmScr[frm];
	}
}
