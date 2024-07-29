package _6.ParkingLot;

import _6.ParkingLot.Enums.VehicleType;

public class Vehicle {
	public String vehicleNo;
	public VehicleType vehicleType;
	
	Vehicle(String vehicleNo, VehicleType vehicleType){
		this.vehicleNo = vehicleNo;
		this.vehicleType = vehicleType;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
}
