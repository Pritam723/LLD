package PricingStrategy;

import _6.ParkingLot.Ticket;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public interface PricingStrategy {
	public int price(Ticket t, ParkingSpot parkingSpot);
}
