package _7.SnakeLadder;

public class Cell {
	// Cell may or may not have a Jump object.
	Jump jump;
	Cell(){
		this.jump = null;
	}
	
	// Later we may set the Jump object.
	public void setJump(Jump jump) {
		this.jump = jump;
	}
}
