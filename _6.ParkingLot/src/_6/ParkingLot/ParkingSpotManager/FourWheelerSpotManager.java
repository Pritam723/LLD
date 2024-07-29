package _6.ParkingLot.ParkingSpotManager;

import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class  FourWheelerSpotManager extends ParkingSpotManager {

	FourWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
		super(parkingSpots, parkingStrategy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ParkingSpot findParkingSpot() {	
        System.out.println("Inside 4W Parking Spot Manager");

		// TODO Auto-generated method stub
		ParkingSpot parkingSpot = parkingStrategy.find(parkingSpots, VehicleType.FourWheeler);
		if(parkingSpot.equals(null)) {
	        System.out.println("No Four Wheeler Spot is empty. Returning NULL.");
		}
		return parkingSpot;
	
	}
}
