package _6.ParkingLot;

import java.time.LocalDateTime;

import _6.ParkingLot.ParkingSpot.ParkingSpot;

public class Ticket {
    public LocalDateTime inTime;
    // Out time will be calculated on exit.
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;
    
    Ticket(Vehicle _vehicle, ParkingSpot _parkingSpot){
    	inTime = LocalDateTime.now();
    	vehicle = _vehicle;
    	parkingSpot = _parkingSpot;
    }
    
}
