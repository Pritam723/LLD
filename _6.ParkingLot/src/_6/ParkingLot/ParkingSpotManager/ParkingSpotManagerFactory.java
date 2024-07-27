package _6.ParkingLot.ParkingSpotManager;

import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class ParkingSpotManagerFactory {
	public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
		switch(vehicleType) {
			case VehicleType.TwoWheeler :
				return new TwoWheelerSpotManager(parkingSpots, parkingStrategy);
			case VehicleType.FourWheeler :
				return new FourWheelerSpotManager(parkingSpots, parkingStrategy);
			default :
				return null;
		}
	}
}
