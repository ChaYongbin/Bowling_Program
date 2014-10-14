package bowling;

public class Player {
	public int[] pins;
	public String name;
	public int playerScore;
	public int count;
	
	Player() {
		name = null;
		playerScore = 0;
		pins = new int[21];
		count= 0;
	}
}
