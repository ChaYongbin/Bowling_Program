package bowling;

public class Spare implements FrameStatus{
	public int score(Player player, int nowFrame){
		return 10 + player.pins[nowFrame + 2];
	}
	
	public String dashBoard(Player player, int nowFrame){
		return "| " + player.pins[nowFrame] + " | " + "/"+ " ";
	}
	
	public String dashBoard_LastFrame(Player player, int nowFrame){
		return "| " + player.pins[nowFrame] + " | " + "/ " + player.pins[nowFrame + 2] + " |";
	}
	
	
	public int increaseNowFrame(int nowFrame){
		return nowFrame + 2;
	}
}
