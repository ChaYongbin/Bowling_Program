package bowling;

public class Game{
	
	PlayerInfo info = new PlayerInfo();
	public Player[] player;
	public int playerNum;
	
	
	public void gameSet(){
		playerNum = info.scanPlayerNum();
		
		player = new Player[playerNum];
		
		for(int i = 0; i < playerNum; i++){
			player[i] = new Player();
			player[i].name = info.scanName(i);
			info.framePins(player[i]);
			info.lastFramePins(player[i]);
		}
	}
	
	public void scoreCal(){
		BowlingCal cal = new BowlingCal();
		for(int i = 0; i < playerNum; i++){
			cal.play(player[i]);
		}
	}
}
