package _6.ParkingLot;

import CostComputation.CostComputation;
import CostComputation.CostComputationFactory;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
//import _6.ParkingLot.ParkingSpotManager.ParkingSpotManager;

public class ExitGate {
	Ticket t;
	ParkingSpot parkingSpot;
	Vehicle vehicle;
	CostComputation costComputaion;
//	ParkingSpotManager parkingSpotManager;
	
	ExitGate(Ticket t){
		// Logically ticket should get us all info.
		this.t = t;
		this.parkingSpot = t.parkingSpot;
		this.vehicle = t.vehicle;
		this.costComputaion = (new CostComputationFactory()).getCostComputation(t.vehicle.getVehicleType());
	}
	
	public int priceCalculation() {
		return costComputaion.getPrice(t, parkingSpot);
	}
	
	public void payment(int price) {
		// Can take other parameters such as payment strategy etc.
		// CARD, CASH, UPI Etc. // Depending on that may apply logic.
		
		Payment payment = new Payment();
		boolean isPaid = payment.pay(price);
		
		if(isPaid) {
			System.out.println("Amount " + price + " paid. Removing Vehicle from the Spot.");
			removeVehicle();
		}

	}
	
	public void removeVehicle() {
		parkingSpot.isEmpty = false;
		parkingSpot.setVehicle(null);
	}
}
