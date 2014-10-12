package bowling;

public class PrintScore extends Game{
	public void totalScore(){
		System.out.println("---------------볼링게임 최종 점수---------------");
		for(int i = 0; i < playerNum; i++){
			System.out.println((i+1) + " 번째 플레이어 : " + player[i].name);
			System.out.println("최종 점수 : " + player[i].playerScore + "점");
			System.out.println("---------------------------------------------");
		}
	}
}
