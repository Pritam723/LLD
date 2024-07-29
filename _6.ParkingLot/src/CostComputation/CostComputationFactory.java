package CostComputation;

import _6.ParkingLot.Enums.VehicleType;


public class CostComputationFactory {
	public CostComputation getCostComputation(VehicleType vehicleType) {
		switch(vehicleType) {
		case VehicleType.TwoWheeler :
			return new TwoWheelerCostComputation();
		case VehicleType.FourWheeler :
			return new FourWheelerCostComputation();
		default :
			return null;
	}
	}
}
