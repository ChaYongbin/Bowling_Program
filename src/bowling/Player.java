package bowling;

public enum Player {
	PLAYER_A, PLAYER_B, PLAYER_C;
	public int count, score, nowFrame;
	public int[] fallPins;
	Player() {
		fallPins = new int[21];
		count = 0;
		score = 0;
		nowFrame = 0;
	}
}
