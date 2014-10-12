package bowling;

public interface FrameStatus {
	public int score(Player player, int nowFrame);
	public int increaseNowFrame(int nowFrame);
}
