package strategyPattern;

public class Vehicle {
	DriveStrategy ds;
	public Vehicle() {
		
	}
	public Vehicle(DriveStrategy ds){
		this.ds = ds;
	}
	public void drive() {
		ds.drive();
	}
}
