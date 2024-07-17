package _5.FactoryAbstractFactoryPattern;

public class AbstractFactory {
	// Can have single class for this, as it is of single type.
	// See, Vehicle Factory was of multiple types here. So, we needed an
	// Interface for that. For this we do not need.
	
	public VehicleFactory getVehicleFactory(String input) {
		switch(input) {
			case "Luxury":
				return new LuxuryVehicleFactory();
			case "Ordinary":
				return new OrdinaryVehicleFactory();
			default:
				return null;
		}
	}

}