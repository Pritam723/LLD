package _6.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.FourWheelerSpot;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingSpot.TwoWheelerSpot;
import _6.ParkingLot.ParkingSpotManager.ParkingSpotManager;
import _6.ParkingLot.ParkingSpotManager.ParkingSpotManagerFactory;
import _6.ParkingLot.ParkingStrategy.NearToElevator;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class EntranceGate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First initialize the parkingSpots.
		List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

		initializeParkingSpots(parkingSpots);
		
		
		int noSpots = parkingSpots.size();

//		for(int i = 0; i < noSpots; i++) {
//			System.out.println(parkingSpots.get(i).id);
//		}
		
		// So, a Vehicle comes here. It must find a Parking Spot using some
		// parking strategy. If it gets a Parking Spot, A ticket will be issued.
		
		Vehicle v1 = new Vehicle("WB26Z8776", VehicleType.FourWheeler);
		
		// For this vehicle we want a spot. For that we need a Manager. Factory will give me that.
		// Factory will give us back a Two or Four Wheeler Parking Spot manager. We also need to pass a strategy now.
		
		ParkingStrategy parkingStrategy = new NearToElevator();
		
		ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
		ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(v1.vehicleType, parkingSpots, parkingStrategy);
		
		// So, for this 4 Wheeler we got back a FourWheelerParkingSpotManager.
		// This will give me a spot from the available 80 4W spots and based on the parking strategy.
		
	}
	
	public static void initializeParkingSpots(List<ParkingSpot> parkingSpots) {
		// Let's add 20 TwoWheelerSpot and 80 FourWheelerSpot.
		
		for(int i = 0; i < 20; i++) {
			parkingSpots.add(new TwoWheelerSpot(i, false, null));
		}
		
		for(int i = 0; i < 80; i++) {
			parkingSpots.add(new FourWheelerSpot(i, false, null));
		}
		
	}

}
