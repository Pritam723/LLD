package _6.ParkingLot.ParkingSpotManager;
import java.util.List;

import _6.ParkingLot.Vehicle;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;


public abstract class ParkingSpotManager {
	public List<ParkingSpot> parkingSpots;
	public ParkingStrategy parkingStrategy;
	
	
	ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy){
		this.parkingSpots = parkingSpots;
		this.parkingStrategy = parkingStrategy;
	}
	
	// For spot.
	public abstract ParkingSpot findParkingSpot();
	// This findParkingSpot method will depend on
	// the strategy we are using. Also TwoWheeler and FourWheeler Spot manager
	// will override these method. Ex. Based on strategy TwoWheeler Spot manager
	// will only find TwoWheeler Spot.
	
	// Rest of the methods are same for both the managers.
	public void addParkingSpot() {
		
	}
	public void removeParkingSpot() {
		
	}
	
	// For Vehicle
	public void parkVehicle(ParkingSpot parkingSpot, Vehicle v1) {
		parkingSpot.isEmpty = true;
		parkingSpot.setVehicle(v1);
	}
	public void removeVehicle(ParkingSpot parkingSpot, Vehicle v1) {
		parkingSpot.isEmpty = false;
		parkingSpot.setVehicle(null);
	}
}
