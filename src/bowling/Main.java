package bowling;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static BowlingCal cal = new BowlingCal();

	public static void savePoint(Player type){
		
		System.out.print("첫 번째 공 : ");
		int firstBall = scan.nextInt();
		System.out.print("두 번째 공 : ");
		int secondBall = scan.nextInt();
		
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
	
	public static void bonusPoint(Player type){
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

	public static void main(String[] args) {
		
		int nthPlayer;
				
		System.out.println("게임 초기 설정");
		System.out.print("게임 참가 인원 (현재는 1명만 가능합니다.) : ");
		nthPlayer = scan.nextInt();
		
		if(nthPlayer == 1) {
			Player A = Player.PLAYER_A;
			
			for(int i=0; i < 10; i++){
				System.out.println( (i+1) + " Frame");
				savePoint(A);
				cal.scoreCal(A, i + 1);
				System.out.println("현재 점수는 " + A.score + "점 입니다.");
				System.out.println();
			}
			
			if(A.fallPins[19] + A.fallPins[20] >= 10) {
				System.out.println( "Bonus Frame");
				bonusPoint(A);
				cal.scoreCal(A, 10);
				System.out.println("최종 점수는 " + A.score + "점 입니다.");
			}else System.out.println("최종 점수는 " + A.score + "점 입니다.");
		}
		
		
		
		/*savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 0);
		savePoint(Player.PLAYER_A, 10, 10);
		bonusPoint(Player.PLAYER_A, 10);
		
		cal.scoreCal(Player.PLAYER_A, 1);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 2);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 3);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 4);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 5);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 6);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 7);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 8);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 9);
		System.out.println(Player.PLAYER_A.score);
		cal.scoreCal(Player.PLAYER_A, 10);
		System.out.println(Player.PLAYER_A.score);*/
	}

}
