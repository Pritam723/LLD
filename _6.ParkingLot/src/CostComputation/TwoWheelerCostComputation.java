package CostComputation;

import PricingStrategy.HourlyPS;
import _6.ParkingLot.Ticket;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public class TwoWheelerCostComputation extends CostComputation {

	TwoWheelerCostComputation(){
		// Assume that for 2-Wheelers we are using HourlyPS.
		super(new HourlyPS());
	}
	@Override
	public int getPrice(Ticket t, ParkingSpot parkingSpot) {
		// TODO Auto-generated method stub
		return pricingStrategy.price(t, parkingSpot);
	}

}
