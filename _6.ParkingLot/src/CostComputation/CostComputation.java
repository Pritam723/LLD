package CostComputation;

import PricingStrategy.PricingStrategy;
import _6.ParkingLot.Ticket;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public abstract class CostComputation {
	PricingStrategy pricingStrategy;
	CostComputation(PricingStrategy pricingStrategy){
		this.pricingStrategy = pricingStrategy;
	}
	abstract public int getPrice(Ticket t, ParkingSpot parkingSpot);
}
