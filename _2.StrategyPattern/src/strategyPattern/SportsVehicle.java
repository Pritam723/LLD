package strategyPattern;

public class SportsVehicle extends Vehicle {
	static SpecialDriveStrategy specialDs = new SpecialDriveStrategy();

	public SportsVehicle() {

		super(specialDs);
	}
}
