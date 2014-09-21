package bowling;

public class BowlingCal {
	
	int[] frmScr;
	int[] thrBall;
	int thrNth = 1;
	
	BowlingCal() {
		frmScr = new int[11];
		thrBall = new int[23];
	}
	
	public int run(int frm, int oneBall, int twoBall) {
		thrBall[frm*2 - 1] = oneBall;
		thrBall[frm*2] = twoBall;
		frmScr[frm] = frmScr[frm - 1] + oneBall + twoBall;	
		if (oneBall + twoBall == 10) {
			int bonus = thrBall[frm*2+1] ;
			return frmScr[frm] + bonus;			
		}
		return frmScr[frm];
	}
}
