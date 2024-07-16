package strategyPattern;

public class NormalVehicle extends Vehicle {
	static NormalDriveStrategy normalDs = new NormalDriveStrategy();
	
	public NormalVehicle() {
		super(normalDs);
	}
	
}
