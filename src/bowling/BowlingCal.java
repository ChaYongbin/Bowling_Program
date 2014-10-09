package bowling;

public class BowlingCal {
	public int scoreCal(Player type, int frame) {
		//Format Data 
		type.score = 0;
		type.nowFrame = 0;
		//Calculator
		for(int i=0; i < frame; i++) {
			//LastFrame
			if(i == 9) {
				type.score += type.fallPins[type.nowFrame] + type.fallPins[type.nowFrame + 1] + type.fallPins[type.nowFrame + 2];  
				continue;
			}
			if(isNextStrike(type,type.nowFrame)) {
				type.score += 20 + type.fallPins[type.nowFrame + 4];
				type.nowFrame += 2;
				continue;
			}
			if(isStrike(type,type.nowFrame)) {
				type.score += 10 + type.fallPins[type.nowFrame + 2] + type.fallPins[type.nowFrame + 3];
				type.nowFrame += 2;
				continue;
			}
			if(isSpare(type,type.nowFrame)) {
				type.score += 10 + type.fallPins[type.nowFrame + 2];
				type.nowFrame += 2;
				continue;
			}
			type.score += type.fallPins[type.nowFrame] + type.fallPins[type.nowFrame + 1];
			type.nowFrame += 2;
		}
		return type.score;
	}
	
	private Boolean isSpare(Player type, int nowFrame) {
		return type.fallPins[nowFrame] + type.fallPins[nowFrame + 1] == 10;
	}
	
	private Boolean isStrike(Player type, int nowFrame) {
		return type.fallPins[nowFrame] == 10;
	}
	
	private Boolean isNextStrike(Player type, int nowFrame) {
		return type.fallPins[nowFrame] == 10 && type.fallPins[nowFrame + 2] == 10;
	}
}
