package bowling;

public enum Player {
	PLAYER_A, PLAYER_B, PLAYER_C;
	public int count;
	public int score;
	public int nowFrame;
	public int[] fallPins;
	Player() {
		fallPins = new int[21];
		count = 0;
		score = 0;
		nowFrame = 0;
	}
}
