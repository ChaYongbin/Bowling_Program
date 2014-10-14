package bowling;

public class FrameBoard {
	private final int frame = 11;
	
	public void drawFrameBoard(){
		for (int i = 1; i < frame; i++) {
			System.out.print(setFrameBoard(i));
		}
		System.out.println("");
	}
	
	
	private String setFrameBoard(int frame){
		if (isFirst(frame)) {
			return "|   " + frame + "   |";
		}
		if (isTen(frame)) {
			return "     " + frame + "    |";
		}
		return "   " + frame + "   |";
	}
	
	private boolean isFirst(int frame) {
		return frame == 1;
	}
	
	private boolean isTen(int frame) {
		return frame == 10;
	}
}
