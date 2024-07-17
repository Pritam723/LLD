package _4.DecoratorPattern;

public class Cheese extends ToppingsDecorator {
	
	public BasePizza basePizza;

	Cheese(BasePizza basePizza){
		this.basePizza = basePizza;
		this.display();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Adding Cheese");
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return basePizza.getPrice() + 25;
	}

}