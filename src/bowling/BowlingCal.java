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
		int nowFrame = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (frame == 9) {
				if (isStrike(player, nowFrame)) {
					sb.append("| X " + "| " + player.pins[nowFrame + 1] + " | " + player.pins[nowFrame + 2] + " |");
					nowFrame++;
				} else if (isSpare(player, nowFrame)) {
					sb.append("| " + player.pins[nowFrame] + " | " + "/ " + player.pins[nowFrame + 2] + " |");
					nowFrame += 2;
				} else {
					sb.append("| " + player.pins[nowFrame] + " | " + player.pins[nowFrame + 1] + " | " + player.pins[nowFrame + 2] + " |");
					nowFrame += 2;
				}
				break;
			}
			if (isStrike(player, nowFrame)) {
				sb.append("|   X   ");
				nowFrame++;
			} else if (isSpare(player, nowFrame)) {
				sb.append("| " + player.pins[nowFrame] + " | " + "/"+ " ");
				nowFrame += 2;
			} else {
				sb.append("| " + player.pins[nowFrame] + " | " + player.pins[nowFrame + 1] + " ");
				nowFrame += 2;
			}
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
