package dependencyInversion;

public class MacBook {
	private final Keyboard kb; // So, the setter will fail.
	// Can be only assigned once. Can be assigned in constructor
	// as that will be called only once.
	
	public MacBook(Keyboard kb) {
		this.kb = kb;
	}
	
//	public void setKeyBoard(Keyboard kb) {
//		this.kb = kb;
//	}
	
	void printConfig() {
		System.out.println("My Mac has a " + kb.display());
	}
	
}
