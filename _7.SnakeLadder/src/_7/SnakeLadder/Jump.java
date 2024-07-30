package _7.SnakeLadder;

public class Jump {
	JumpType jumpType;
	int start;
	int end;
	
	// For SNAKE, end will be < start. For LADDER it is opposite.
	
	Jump(JumpType jumpType, int start, int end){
		this.jumpType = jumpType;
		this.start = start;
		this.end = end;
	}
	
	public JumpType getJumpType() {
		return jumpType;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

}
