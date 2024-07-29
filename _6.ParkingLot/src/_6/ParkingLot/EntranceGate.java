package _6.ParkingLot;

import java.util.List;

import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingSpotManager.ParkingSpotManager;
import _6.ParkingLot.ParkingSpotManager.ParkingSpotManagerFactory;
import _6.ParkingLot.ParkingStrategy.NearToElevator;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class EntranceGate {
	ParkingSpotManager parkingSpotManager;
	
	EntranceGate(List<ParkingSpot> parkingSpots, Vehicle v1){
		// For a vehicle we want a spot. For that we need a Manager. Factory will give me that.
		// Factory will give us back a Two or Four Wheeler Parking Spot manager. We also need to pass a strategy now.
		ParkingStrategy parkingStrategy = new NearToElevator(); // Can take it as parameter too.
		
		ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
		parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(v1.vehicleType, parkingSpots, parkingStrategy);
	}

	public ParkingSpot findSpace() {	
		// So, for this 4 Wheeler we got back a FourWheelerParkingSpotManager.
		// This will give me a spot from the available 80 4W spots and based on the parking strategy.
		ParkingSpot parkingSpot = parkingSpotManager.findParkingSpot();
		return parkingSpot;
	}
	
	public void bookSpot(ParkingSpot parkingSpot, Vehicle v1) {
		parkingSpotManager.parkVehicle(parkingSpot, v1);
	}
	
	public Ticket getTicket(Vehicle v1, ParkingSpot parkingSpot) {
		return new Ticket(v1, parkingSpot);
	}
	
	
}
