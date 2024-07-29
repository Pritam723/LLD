package PricingStrategy;

import java.time.LocalDateTime;

import _6.ParkingLot.Ticket;
import _6.ParkingLot.ParkingSpot.ParkingSpot;

public class MinuteWisePS implements PricingStrategy {

	@Override
	public int price(Ticket t, ParkingSpot parkingSpot) {
		// TODO Auto-generated method stub
		// First we see what is the current time, This will be called during exit only.
		LocalDateTime outTime = LocalDateTime.now();
		LocalDateTime inTime = t.inTime;
		
		// We can calculate hours from here.
		// Here 1Hr 20min is taken as 80Min, not 2Hr.
		// Assume Hourly rate as 100.
		
		return ((parkingSpot.getPrice()*80)/60); // Handle Integer Division/Doubles carefully.
		
	}

}
