package _3.ObserverDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable iphoneObservable = new IphoneObservable();
		
		NotificationAlertObserver observer1 = new EmailAlertObserver("abc@gmail.com", iphoneObservable);
		NotificationAlertObserver observer2 = new MobileAlertObserver("11-22-33-44-55", iphoneObservable);
		
//		iphoneObservable.add(observer1);
//		iphoneObservable.add(observer2);
		
		iphoneObservable.setStockCount(10);
		
		iphoneObservable.setStockCount(20);
	}

}
