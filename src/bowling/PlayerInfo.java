package bowling;

public class PlayerInfo extends ScanInfo{
	
	public void framePins(Player player){
		player.count = 0;
		for(int frame=0; frame < 9; frame++){
			firstBall(player, player.count);
			if(player.pins[player.count] == 10){
				player.count++;
				continue;
			}
			player.count++;
			secondBall(player, player.count);
			player.count++;
		}
	}
	
	public void savePins(Player player){
		firstBall(player, player.count);
		if(player.pins[player.count] == 10){
			player.count++;
			return;
		}
		player.count++;
		secondBall(player, player.count);
		player.count++;
	}
	
	
	public void lastFramePins(Player player){
		firstBall(player, player.count);
		player.count++;
		secondBall(player, player.count);
		player.count++;
		if(player.pins[player.count - 2] + player.pins[player.count - 1] >= 10){
			bonusBall(player, player.count);
		}
	}
}
