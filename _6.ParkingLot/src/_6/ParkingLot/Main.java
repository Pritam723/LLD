package _6.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import _6.ParkingLot.Enums.VehicleType;
import _6.ParkingLot.ParkingSpot.FourWheelerSpot;
import _6.ParkingLot.ParkingSpot.ParkingSpot;
import _6.ParkingLot.ParkingSpot.TwoWheelerSpot;
//import _6.ParkingLot.ParkingSpotManager.ParkingSpotManager;
//import _6.ParkingLot.ParkingSpotManager.ParkingSpotManagerFactory;
//import _6.ParkingLot.ParkingStrategy.NearToElevator;
//import _6.ParkingLot.ParkingStrategy.ParkingStrategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First initialize the parkingSpots.
		List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();

		initializeParkingSpots(parkingSpots);
		
		
//		int noSpots = parkingSpots.size();

//		for(int i = 0; i < noSpots; i++) {
//			System.out.println(parkingSpots.get(i).id);
//		}
		
		// So, a Vehicle comes here. It must find a Parking Spot using some
		// parking strategy. If it gets a Parking Spot, A ticket will be issued.
		
		Vehicle v1 = new Vehicle("WB26Z8776", VehicleType.FourWheeler);
		
		EntranceGate entranceGate = new EntranceGate(parkingSpots, v1);
		
		// Finding Parking Spot.
		ParkingSpot parkingSpot = entranceGate.findSpace();
		
		//We can check for NULL too.
//		if(parkingSpot.equals(null)) return;
		
		// Booking the Spot and getting ticket.
		entranceGate.bookSpot(parkingSpot, v1);
		
		// So, based on this spot, a Ticket will be generated.
		Ticket tckt1 = entranceGate.getTicket(v1, parkingSpot);
		
		
		
		// So, our booking is done. We need to think about exit now.
		ExitGate exitGate = new ExitGate(tckt1);
		int price = exitGate.priceCalculation();
		System.out.println("Price is " + price);
		exitGate.payment(price);
		
		
	}
	
	public static void initializeParkingSpots(List<ParkingSpot> parkingSpots) {
		
		// Should run only once.
		if(parkingSpots.size() > 0) return;
		
		// Let's add 20 TwoWheelerSpot and 80 FourWheelerSpot.
		
		for(int i = 0; i < 20; i++) {
			parkingSpots.add(new TwoWheelerSpot(i, true, null));
		}
		
		for(int i = 0; i < 80; i++) {
			parkingSpots.add(new FourWheelerSpot(i, true, null));
		}
		
	}

}
