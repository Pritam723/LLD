package _3.ObserverDesignPattern;

import java.util.List;
import java.util.ArrayList;

public class IphoneObservable implements StockObservable {
	
	public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
	public int stockCount = 0;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		int n = observerList.size();
		for(int i = 0; i < n; i++) {
			if(observerList.get(i).equals(observer)) {
				observerList.remove(i);
				break;
			}
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		// TODO Auto-generated method stub
		
		// So, the logic is if stockCount was 0,
		// So, it is becoming > 0 now. So, notify all.
		// Or we may write other logic too.
		stockCount = stockCount + newStockAdded;
		System.out.println("New stock is " + Integer.toString(stockCount));
		notifySubscribers();


	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return this.stockCount;
	}
	
	@Override
	public String generateMsg() {
		// TODO Auto-generated method stub
		return "Iphone is back in Stock. Available stock is: " + this.stockCount;
	}


	@Override
	public void notifySubscribers() {
		// TODO Auto-generated method stub
		for(NotificationAlertObserver observer: observerList) {
			observer.update();
		}

	}

}
