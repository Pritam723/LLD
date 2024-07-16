package strategyPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new SportsVehicle();
		Vehicle v2 = new NormalVehicle();

		v1.drive();
		v2.drive();
	}

}
