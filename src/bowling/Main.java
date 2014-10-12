package bowling;

public class Main {
	public static void main(String[] args){
		PrintScore print = new PrintScore();
		
		System.out.println("안녕하세요. 볼링게임입니다.");
		print.gameSet();
		print.scoreCal();
		print.totalScore();
		System.out.println("END");
	}
}
