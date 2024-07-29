package _6.ParkingLot.ParkingStrategy;

import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public class NearToEntrance implements ParkingStrategy {

	@Override
	public ParkingSpot find(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
		// TODO Auto-generated method stub
		
		// Although we are not using any strategy logic here. We can implement that accordingly.
        for (int i = 0; i < parkingSpots.size(); i++) {
        	
        	ParkingSpot parkingSpot = parkingSpots.get(i); 
            // Print all elements of List
        	if(!parkingSpot.vehicleType.equals(vehicleType)) continue;
        	if(parkingSpot.isEmpty) return parkingSpot;
        	
        }
		return null;
	}

}
