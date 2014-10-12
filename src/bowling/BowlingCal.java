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
	
	private Boolean isStrike(Player player, int nowFrame) {
		return player.pins[nowFrame] == 10;
	}
	
	private Boolean isSpare(Player player, int nowFrame) {
		return player.pins[nowFrame] + player.pins[nowFrame + 1] == 10;
	}
}
