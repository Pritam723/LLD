package _5.FactoryAbstractFactoryPattern;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Factory Pattern Example. Shapes: Circle, Square.
		
		ShapeFactory sFactory = new ShapeFactory();
		Scanner sObj = new Scanner(System.in);
		
		System.out.println("Provide Input: ");

		String input = sObj.nextLine();
		Shape shape1 = sFactory.getShape(input);
		
		shape1.draw();
//		sObj.close();
		
		
		// Abstract Factory (Factory of Factory) Pattern example.
		// Vehicle and Vehicle Factory.
		
//		Scanner sObj = new Scanner(System.in);
		System.out.println("Which Vehicle Factory do you need ?");

		String factoryType = sObj.nextLine();
		
		AbstractFactory abstractFactory = new AbstractFactory();
		VehicleFactory vehicleFactory = abstractFactory.getVehicleFactory(factoryType);
		
		System.out.println("Which Vehicle do you need ?");

		String vehicleType = sObj.nextLine();
		Vehicle v1 = vehicleFactory.getVehicle(vehicleType);
		
		System.out.println("Average is : " + v1.getAverage());
		
		sObj.close();
		
	}

}
