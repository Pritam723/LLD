package _6.ParkingLot.ParkingSpot;

import _6.ParkingLot.Vehicle;
import _6.ParkingLot.Enums.VehicleType;

public class TwoWheelerSpot extends ParkingSpot {
	public TwoWheelerSpot(int _id, boolean _isEmpty, Vehicle _vehicle){
		super(_id,_isEmpty,_vehicle, VehicleType.TwoWheeler);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 10;
	}
}
