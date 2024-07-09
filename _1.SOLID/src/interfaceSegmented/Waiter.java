package interfaceSegmented;

public class Waiter implements WaiterInterface {
	@Override
	public void serveCustomer() {
		System.out.println("Serving Customer");
	}
	
	@Override
	public void takeOrder() {
		System.out.println("Taking Order");
	}
}
