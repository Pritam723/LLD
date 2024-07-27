package _6.ParkingLot.ParkingSpot;

import _6.ParkingLot.Vehicle;
import _6.ParkingLot.Enums.VehicleType;

public class FourWheelerSpot extends ParkingSpot {
	public FourWheelerSpot(int _id, boolean _isEmpty, Vehicle _vehicle){
		super(_id,_isEmpty,_vehicle,VehicleType.FourWheeler);
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 40;
	}
}
