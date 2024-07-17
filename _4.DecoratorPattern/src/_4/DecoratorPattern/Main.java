package _4.DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizza p1 = new Margarita();
		BasePizza p2 = new Mushroom(p1);
		BasePizza p3 = new Cheese(p2);
		
//		i) No one asks for margarita with extravaganza.
//		ii) Also ToppingsDecorator is a BasePizza too.
		
		System.out.println("Total price is " + p3.getPrice());
		
	}

}
