package liskovSubstitution;

public class Bicycle implements Vehicle {
	@Override
	public int getWheels() {
		return 2;
	}
	
	// See, Engine Vehicle has hasEnginee method.
	// Vehicle does not have that. So, even if we
	// make Vehicle v1 = new Bicycle(); 
	// Then v1.hasEnginee() will give compile time error.
	// Not run time error.
	
	// Also if we try to do EngineVehicle ev1 = new Bicycle();
	// It will also give compile time error.
}
