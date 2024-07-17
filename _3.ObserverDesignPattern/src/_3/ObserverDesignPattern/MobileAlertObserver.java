package _3.ObserverDesignPattern;

public class MobileAlertObserver implements NotificationAlertObserver {
	public String mobileNo;
	public StockObservable observable;
	
	public MobileAlertObserver(String mobileNo, StockObservable observable) {
		this.mobileNo = mobileNo;
		this.observable = observable;
		observable.add(this); // If we do not write this, we need to explicitly add it in observable.
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendNotification(mobileNo,observable.generateMsg());
	}
	
	public void sendNotification(String mobileNo, String msg) {
		System.out.println(msg);
		System.out.println("Mobile notification sent to " + mobileNo);
	}

}
