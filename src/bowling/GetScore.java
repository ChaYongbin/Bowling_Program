package bowling;

public class GetScore implements FrameStatus {
	public int score(Player player, int nowFrame) {
		return player.pins[nowFrame] + player.pins[nowFrame + 1];
	}
	
	public int increaseNowFrame(int nowFrame){
		return nowFrame + 2;
	}
}
