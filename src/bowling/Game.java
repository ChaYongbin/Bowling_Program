package bowling;

public class Game{
	
	PlayerInfo info = new PlayerInfo();
	FrameBoard draw = new FrameBoard();
	BowlingCal cal = new BowlingCal();
	
	public Player[] player;
	public int playerNum;
	
	
	public void gameSet(){
		playerNum = info.scanPlayerNum();
		
		player = new Player[playerNum];
		
		for(int i = 0; i < playerNum; i++){
			player[i] = new Player();
			player[i].name = info.scanName(i);
			//info.framePins(player[i]);
			//info.lastFramePins(player[i]);
		}
	}
	
	// 이 코드도 이후에 클래스를 나눌지 생각을 해보고 변수명 다시 정해야할 듯.
	public void getPins(int frame){
		for(int num = 0; num < playerNum; num++){
			info.printName(player[num]);
			if(frame == 9){
				info.lastFramePins(player[num]);
				draw.drawFrameBoard();
				System.out.println(cal.frameStatusBoard(player[num]));
				continue;
			}
			info.savePins(player[num]);
			draw.drawFrameBoard();
			System.out.println(cal.frameStatusBoard(player[num]));
		}
	}
	
	public void scoreCal(){
		BowlingCal cal = new BowlingCal();
		for(int i = 0; i < playerNum; i++){
			cal.play(player[i]);
		}
		
	}
}
