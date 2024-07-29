package _6.ParkingLot.ParkingSpotManager;

//import java.util.ArrayList;
import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class TwoWheelerSpotManager extends ParkingSpotManager {
	
	TwoWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
		super(parkingSpots, parkingStrategy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ParkingSpot findParkingSpot() {
		// TODO Auto-generated method stub
		ParkingSpot parkingSpot = parkingStrategy.find(parkingSpots, VehicleType.TwoWheeler);
		if(parkingSpot.equals(null)) {
	        System.out.println("No Two Wheeler Spot is empty. Returning NULL.");
		}
		return parkingSpot;
	}

}
