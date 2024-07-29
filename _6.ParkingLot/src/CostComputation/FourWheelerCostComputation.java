package CostComputation;

import PricingStrategy.MinuteWisePS;
import _6.ParkingLot.Ticket;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public class FourWheelerCostComputation extends CostComputation {

	FourWheelerCostComputation() {
		// Assume that for 4-Wheelers we are using MinuteWisePS.
		super(new MinuteWisePS());
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPrice(Ticket t, ParkingSpot parkingSpot) {
		// TODO Auto-generated method stub
		return pricingStrategy.price(t, parkingSpot);
	}

}
