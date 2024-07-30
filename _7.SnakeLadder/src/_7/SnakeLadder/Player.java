package _7.SnakeLadder;

public class Player {
	public int id;
	public String name;
	public int currentPos;
	
	Player(int id, String name){
		this.id = id;
		this.name = name;
		this.currentPos = 0; // By default current pos is 0.
	}
}
