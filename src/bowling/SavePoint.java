package bowling;

import java.util.Scanner;

public class SavePoint {
	public Scanner scan = new Scanner(System.in);
	
	public void savePoint(Player type){
		// Ball set
		int firstBall, secondBall = 0;	
		// Scan Ball Data
		System.out.print("첫 번째 공 : ");
		firstBall = scan.nextInt();
		System.out.print("두 번째 공 : ");
		secondBall = scan.nextInt();
		// Save Ball Point
		switch(type) {
			case PLAYER_A:
				Player.PLAYER_A.fallPins[Player.PLAYER_A.count++] = firstBall;
				Player.PLAYER_A.fallPins[Player.PLAYER_A.count++] = secondBall;
				break;
			case PLAYER_B:
				Player.PLAYER_B.fallPins[Player.PLAYER_B.count++] = firstBall;
				Player.PLAYER_B.fallPins[Player.PLAYER_B.count++] = secondBall;
				break;
			case PLAYER_C:
				Player.PLAYER_C.fallPins[Player.PLAYER_C.count++] = firstBall;
				Player.PLAYER_C.fallPins[Player.PLAYER_C.count++] = secondBall;
				break;
		}
	}	
	
	public void bonusPoint(Player type){
		//Scan Bonus Ball Data
		System.out.print("보너스 공 : ");
		int bonusBall = scan.nextInt();
		// BonusPoint
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
