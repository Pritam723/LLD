package dependencyInversion;

// Class should depend on Interface rather than concrete class.

public class Main {
	public static void main(String[] args) {
		
		WirelessKeyBoard wlkb = new WirelessKeyBoard();
		WiredKeyBoard wkb = new WiredKeyBoard();
		
		MacBook m1 = new MacBook(wlkb);
		m1.printConfig();
		
		MacBook m2 = new MacBook(wkb);
		m2.printConfig();
		
	}
}