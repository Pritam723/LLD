package _3.ObserverDesignPattern;

public class EmailAlertObserver implements NotificationAlertObserver {

	public String emailID;
	public StockObservable observable;
	
	public EmailAlertObserver(String emailID, StockObservable observable) {
		this.emailID = emailID;
		this.observable = observable;
		
		observable.add(this); // This line is very important. We must add this observer
		// in the observable's list.
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendNotification(emailID,observable.generateMsg());
	}
	
	public void sendNotification(String emailID, String msg) {
		System.out.println(msg);
		System.out.println("Email notification sent to " + emailID);
	}

}