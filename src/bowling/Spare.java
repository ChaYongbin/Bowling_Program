package bowling;

public class Spare implements FrameStatus{
	public int score(Player player, int nowFrame){
		return 10 + player.pins[nowFrame + 2];
	}
	
	public int increaseNowFrame(int nowFrame){
		return nowFrame + 2;
	}
}
