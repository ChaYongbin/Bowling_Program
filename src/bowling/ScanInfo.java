package bowling;

import java.util.Scanner;

public class ScanInfo{
	
	Scanner scan = new Scanner(System.in);
	
	public int scanPlayerNum(){
		System.out.println("플레이어 수를 입력하세요.");
		System.out.print("플레이어 수 : ");
		int playerNum = scan.nextInt();
		System.out.println();
		return playerNum;
	}
	public String scanName(int playerIndex){
		String name = "";
		System.out.println("* " + (playerIndex + 1) + " 번째 플레이어 이름을 입력하세요.");
		name = scan.next();
		System.out.println("등록 되었습니다.");
		return name;
	}
	
	public int firstBall(Player player, int index){
		System.out.print("첫 번째 공 : ");
		player.pins[index] = scan.nextInt();
		return player.pins[index];
	}
	
	public int secondBall(Player player, int index){
		System.out.print("두 번째 공 : ");
		player.pins[index] = scan.nextInt();
		return player.pins[index];
	}
	
	public int bonusBall(Player player, int index){
		System.out.print("보너스 프레임: ");
		player.pins[index] = scan.nextInt();
		return player.pins[index];
	}
	

}
