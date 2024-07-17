package _5.FactoryAbstractFactoryPattern;

public class OrdinaryVehicleFactory implements VehicleFactory {

	@Override
	public Vehicle getVehicle(String input) {
		// TODO Auto-generated method stub
		switch(input) {
			case "Alto":
				return new Alto();
			case "Kwid":
				return new Kwid();
			default:
				return null;
		}
	}

}
