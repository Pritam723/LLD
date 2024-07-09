package dependencyInversion;

public class WiredKeyBoard implements Keyboard {
	
	@Override
	public String display() {
		return "WiredKeyBoard";
	}
}
