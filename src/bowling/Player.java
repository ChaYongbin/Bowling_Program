package bowling;

public class Player {
	public int[] pins;
	public String name;
	public int playerScore;
	
	Player() {
		name = null;
		playerScore = 0;
		pins = new int[21];
	}
}
