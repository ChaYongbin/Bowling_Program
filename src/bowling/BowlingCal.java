package bowling;

public class BowlingCal {
	
	int[] fallPins = new int[20];
	int[] frameScr = new int[10];
	int count = 0;
	int nowFrame = 0;

	public void savePinPoint(int point) {
		fallPins[count] = point;
		count++;
	}

	public int scoreCal() {
		int score = 0;
		for(int frame=0; frame < 10; frame++) {
			if(isNextStrike(nowFrame)) {
				score += 20 + fallPins[nowFrame + 4];
				nowFrame += 2;
				continue;
			}
			if(isStrike(nowFrame)) {
				score += 10 + fallPins[nowFrame + 2] + fallPins[nowFrame + 3];
				nowFrame += 2;
				continue;
			}
			if(isSpare(nowFrame)) {
				score += 10 + fallPins[nowFrame + 2];
				nowFrame += 2;
				continue;
			}
			score += fallPins[nowFrame] + fallPins[nowFrame + 1];
			nowFrame += 2;
		}
		return score;
	}
	
	public Boolean isSpare(int nowFrame) {
		return fallPins[nowFrame] + fallPins[nowFrame + 1] == 10;
	}
	public Boolean isStrike(int nowFrame) {
		return fallPins[nowFrame] == 10;
	}
	public Boolean isNextStrike(int nowFrame) {
		return fallPins[nowFrame] == 10 && fallPins[nowFrame + 2] == 10;
	}
	
}
