package _6.ParkingLot.ParkingSpot;

import _6.ParkingLot.Vehicle;
import _6.ParkingLot.Enums.VehicleType;

public abstract class ParkingSpot {
	
	// This is single Spot, to manage multiple spots, use a
	// parking spot manager.
	
	public int id;
	public boolean isEmpty;
	public Vehicle vehicle;
	public VehicleType vehicleType; 
	
	ParkingSpot(int _id, boolean _isEmpty, Vehicle _vehicle, VehicleType _vehicleType){
		id = _id;
		isEmpty = _isEmpty;
		vehicle = _vehicle;
		vehicleType = _vehicleType;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	// Abstract method which will be overridden by Child components.
	public abstract int getPrice();
	
}
