package bowling;

import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	public static BowlingCal cal = new BowlingCal();
	public static SavePoint save = new SavePoint();
	
	private static void RealTime(Player type){
		for(int i=0; i < 10; i++){
			System.out.println( (i+1) + " Frame");
			save.savePoint(type);
			cal.scoreCal(type, i + 1);
			System.out.println("현재 점수는 " + type.score + "점 입니다.");
			System.out.println();
		}
	}
	
	private static void BonusFrame(Player type){
		System.out.println( "Bonus Frame");
		save.bonusPoint(type);
		cal.scoreCal(type, 10);
	}
	
	private static void TotalScore(Player type){
		System.out.println("최종 점수는 " + type.score + "점 입니다.");
	}
	
	
	private static Boolean isBonus(Player type){
		return type.fallPins[19] + type.fallPins[20] >= 10;
	}
	
	public static void main(String[] args) {
			
		System.out.println("게임 초기 설정");
		System.out.print("게임 참가 인원 (현재는 1명만 가능합니다.) : ");
		int nthPlayer = scan.nextInt();
		
		switch(nthPlayer) {
			case 1:
				Player ONE_A = Player.PLAYER_A;
				RealTime(ONE_A);
				if(isBonus(ONE_A)){
					BonusFrame(ONE_A);
				}
				TotalScore(ONE_A);
				break;
			case 2:
				Player TWO_A = Player.PLAYER_A;
				Player TWO_B = Player.PLAYER_B;
				System.out.println("== Player A Score ==");
				RealTime(TWO_A);
				if(isBonus(TWO_A)){
					BonusFrame(TWO_A);
				}
				TotalScore(TWO_A);
				
				System.out.println("== Player B Score ==");
				RealTime(TWO_B);
				if(isBonus(TWO_B)){
					BonusFrame(TWO_B);
				}
				TotalScore(TWO_B);
				break;
			case 3:
				Player THREE_A = Player.PLAYER_A;
				Player THREE_B = Player.PLAYER_B;
				Player THREE_C = Player.PLAYER_C;
				System.out.println("== Player A Score ==");
				RealTime(THREE_A);
				if(isBonus(THREE_A)){
					BonusFrame(THREE_A);
				}
				TotalScore(THREE_A);
				
				System.out.println("== Player B Score ==");
				RealTime(THREE_B);
				if(isBonus(THREE_B)){
					BonusFrame(THREE_B);
				}
				TotalScore(THREE_B);
				
				System.out.println("== Player C Score ==");
				RealTime(THREE_C);
				if(isBonus(THREE_C)){
					BonusFrame(THREE_C);
				}
				TotalScore(THREE_C);
				break;
		}
	}
}
