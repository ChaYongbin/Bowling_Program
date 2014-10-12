package bowling;

public class PlayerInfo extends ScanInfo{
	
	public int index;
	
	public void framePins(Player player){
		index = 0;
		for(int frame=0; frame < 9; frame++){
			firstBall(player, index);
			if(player.pins[index] == 10){
				index++;
				continue;
			}
			index++;
			secondBall(player, index);
			index++;
		}
	}
	
	public void lastFramePins(Player player){
		firstBall(player, index);
		index++;
		secondBall(player, index);
		index++;
		if(player.pins[index - 2] + player.pins[index - 1] >= 10){
			bonusBall(player, index);
		}
	}
}
