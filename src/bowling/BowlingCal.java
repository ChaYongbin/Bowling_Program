package bowling;

public class BowlingCal {
	
	int[] thrBall = new int [21]; // 공을 던지는 것은 한 게임당 최대 21번이다.
	int[] frmScore = new int [10]; 
	int count = 0;
	
	public void fallPins(int pins) {
		thrBall[count] = pins;
		count++;
	}
	
	public int frameScore(int inFrame) {
		int frame = inFrame * 2;
		if(inFrame - 1 == -1) {
			if(isSpare(frame) && thrBall[frame] != 10) {
				return thrBall[frame] + thrBall[frame + 1] + thrBall[frame + 2];
			}
			if(isStrike(frame) && thrBall[frame + 2] != 10) {
				return thrBall[frame] + thrBall[frame + 2] + thrBall[frame + 3];
			}
			if(isNextStrike(frame)) {
				return thrBall[frame] + thrBall[frame + 2] + thrBall[frame + 4];
			}
			return thrBall[frame] + thrBall[frame + 1];
		}
		if(isSpare(frame) && thrBall[frame] != 10) {
			return frmScore[inFrame - 1] + thrBall[frame] + thrBall[frame + 1] + thrBall[frame + 2];
		}
		if(isStrike(frame) && thrBall[frame + 2] != 10) {
			return frmScore[inFrame - 1] + thrBall[frame] + thrBall[frame + 2] + thrBall[frame + 3];
		}
		if(isNextStrike(frame)) {
			return frmScore[inFrame - 1] + thrBall[frame] + thrBall[frame + 2] + thrBall[frame + 4];
		}
		return frmScore[inFrame - 1] + thrBall[frame] + thrBall[frame + 1];
	}
	
	public int sumFrameScore() {
		int scr = 0;
		for(int frame = 0; frame < 10; frame++) {
			scr += frmScore[frame];
		}
		return scr;
	}
	
	public Boolean isSpare(int frame) {
		return thrBall[frame] + thrBall[frame + 1] == 10;
	}
	public Boolean isStrike(int frame) {
		return thrBall[frame] == 10;
	}
	public Boolean isNextStrike(int frame) {
		return thrBall[frame + 2] == 10;
	}
}
