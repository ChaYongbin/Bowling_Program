package bowling;

public class BowlingCal {
	
	public void play(Player player){
		int nowFrame = 0;
		
		for(int frameNum=0; frameNum < 10; frameNum++){
			FrameStatus frame;
			
			if(isStrike(player, nowFrame)) {                                                                                                                                                                                       
				frame = new Strike();
			} else if (isSpare(player, nowFrame)) {
				frame = new Spare();
			} else {
				frame = new GetScore();
			}
			player.playerScore += frame.score(player, nowFrame);
			nowFrame = frame.increaseNowFrame(nowFrame);
		}
	}
	
	public String frameStatusBoard(Player player) {
		StringBuffer sb = new StringBuffer();
		FrameStatus frame;
		
		int nowFrame = 0;
		for (int frameNum = 0; frameNum < 10; frameNum++) {
			if (frameNum == 9) {
				if(isStrike(player, nowFrame)) {                                                                                                                                                                                       
					frame = new Strike();
				} else if (isSpare(player, nowFrame)) {
					frame = new Spare();
				} else {
					frame = new GetScore();
				}
				sb.append(frame.dashBoard_LastFrame(player, nowFrame));
				break;
			}
			
			if(isStrike(player, nowFrame)) {                                                                                                                                                                                       
				frame = new Strike();
			} else if (isSpare(player, nowFrame)) {
				frame = new Spare();
			} else {
				frame = new GetScore();
			}
			sb.append(frame.dashBoard(player, nowFrame));
			nowFrame = frame.increaseNowFrame(nowFrame);
			
		}
		return sb.toString();
	}
	
	private Boolean isStrike(Player player, int nowFrame) {
		return player.pins[nowFrame] == 10;
	}
	
	private Boolean isSpare(Player player, int nowFrame) {
		return player.pins[nowFrame] + player.pins[nowFrame + 1] == 10;
	}
}
