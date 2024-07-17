package _4.DecoratorPattern;

public abstract class ToppingsDecorator extends BasePizza {
	// By default it will inherit the getPrice() method.
	
	// CRUX of Decorator pattern is, here ToppingsDecorator
	// i) Has a BasePizza.
	// ii) Is a BasePizza.
	public abstract void display();
}
