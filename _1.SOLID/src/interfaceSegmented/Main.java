package interfaceSegmented;

// Interfaces should be such that client should not implement unnecessary functions they
// do not need.


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RestaurantEmp waiter = new Waiter(); 
//		waiter.takeOrder(); // Will give Compile time error.
		// RestaurantEmp does not know about takeOrder().
		
		WaiterInterface waiter = new Waiter(); 
		waiter.takeOrder(); // Will not give error.
	}

}