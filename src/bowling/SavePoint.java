package bowling;

import java.util.Scanner;

public class SavePoint {
	
	public Scanner scan = new Scanner(System.in);
	
	public void savePoint(Player type){
		
		int firstBall = 0;
		int secondBall = 0;
		
		System.out.print("첫 번째 공 : ");
		firstBall = scan.nextInt();
		System.out.print("두 번째 공 : ");
		secondBall = scan.nextInt();
		
		switch(type) {
			case PLAYER_A:
				Player.PLAYER_A.fallPins[Player.PLAYER_A.count] = firstBall;
				Player.PLAYER_A.count++;
				Player.PLAYER_A.fallPins[Player.PLAYER_A.count] = secondBall;
				Player.PLAYER_A.count++;
				break;
			case PLAYER_B:
				Player.PLAYER_B.fallPins[Player.PLAYER_B.count] = firstBall;
				Player.PLAYER_B.count++;
				Player.PLAYER_B.fallPins[Player.PLAYER_B.count] = secondBall;
				Player.PLAYER_B.count++;
				break;
			case PLAYER_C:
				Player.PLAYER_C.fallPins[Player.PLAYER_C.count] = firstBall;
				Player.PLAYER_C.count++;
				Player.PLAYER_C.fallPins[Player.PLAYER_C.count] = secondBall;
				Player.PLAYER_C.count++;
				break;
		}
	}	
	
	public void bonusPoint(Player type){
		
		System.out.print("보너스 공 : ");
		int bonusBall = scan.nextInt();
		
		switch(type) {
		case PLAYER_A:
			Player.PLAYER_A.fallPins[Player.PLAYER_A.count] = bonusBall;
			break;
		case PLAYER_B:
			Player.PLAYER_B.fallPins[Player.PLAYER_B.count] = bonusBall;
			break;
		case PLAYER_C:
			Player.PLAYER_C.fallPins[Player.PLAYER_C.count] = bonusBall;

			break;
		}
	}
}
