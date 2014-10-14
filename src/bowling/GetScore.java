package bowling;

public class GetScore implements FrameStatus {
	public int score(Player player, int nowFrame) {
		return player.pins[nowFrame] + player.pins[nowFrame + 1];
	}
	
	public String dashBoard(Player player, int nowFrame){
		return "| " + player.pins[nowFrame] + " | " + player.pins[nowFrame + 1] + " ";
	}
	
	public String dashBoard_LastFrame(Player player, int nowFrame){
		return "| " + player.pins[nowFrame] + " | " + player.pins[nowFrame + 1] + " | " + player.pins[nowFrame + 2] + " |";
	}
	
	public int increaseNowFrame(int nowFrame){
		return nowFrame + 2;
	}
}
