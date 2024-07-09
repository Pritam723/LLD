package liskovSubstitution;

public class Bike extends EngineVehicle {
	
	// getWheels behavior as same as parent.
	
	@Override
	public Boolean hasEngine() {
		return true;
	}
}
