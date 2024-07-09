package liskovSubstitution;


// Subclass should extend the capability of the parent, not narrow it down.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EngineVehicle ev1 = new Car();
//		EngineVehicle ev1 = new Bicycle(); // Type mismatch.
		
		Vehicle v1 = new Bicycle(); // This is fine.
		
		
//		System.out.println(v1.hasEngine()); // Will not allow in compile time.
		
		System.out.println(ev1.hasEngine()); // This is fine though.
		
		System.out.println(v1.getWheels());
		System.out.println(ev1.getWheels());
	}

}
