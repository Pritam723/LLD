package _5.FactoryAbstractFactoryPattern;

public class LuxuryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String input) {
		// TODO Auto-generated method stub
		switch(input) {
			case "SClass":
				return new SClass();
			case "D320":
				return new D320();
			default:
				return null;
		}
	}

}
