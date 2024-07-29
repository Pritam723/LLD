package _6.ParkingLot.ParkingStrategy;

import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public interface ParkingStrategy {
	public ParkingSpot find(List<ParkingSpot> parkingSpots, VehicleType vehicleType); 
}
