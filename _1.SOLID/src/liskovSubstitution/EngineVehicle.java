package liskovSubstitution;

public class EngineVehicle implements Vehicle {

	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	public Boolean hasEngine() {
		return false;
	}

}