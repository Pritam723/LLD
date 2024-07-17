package _4.DecoratorPattern;

public class Mushroom extends ToppingsDecorator {
	
	public BasePizza basePizza;
	
	Mushroom(BasePizza basePizza){
		this.basePizza = basePizza;
		this.display();
	}
	
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return basePizza.getPrice() + 10;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Adding Mushroom");
	}

}
