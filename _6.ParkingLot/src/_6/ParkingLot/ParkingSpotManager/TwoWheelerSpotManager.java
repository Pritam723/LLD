package _6.ParkingLot.ParkingSpotManager;

//import java.util.ArrayList;
import java.util.List;

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
        for (int i = 0; i < parkingSpots.size(); i++) {
        	
        	ParkingSpot parkingSpot = parkingSpots.get(i); 
            // Print all elements of List
        	if(parkingSpot.isEmpty) return parkingSpot;
        	
        }
        System.out.println("No Two Wheeler Spot is empty. Returning NULL.");
		return null;
	}

}
