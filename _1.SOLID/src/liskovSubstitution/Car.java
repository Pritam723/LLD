package liskovSubstitution;

public class Car extends EngineVehicle {
	
	
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	@Override
	public Boolean hasEngine() {
		return true;
	}
}
