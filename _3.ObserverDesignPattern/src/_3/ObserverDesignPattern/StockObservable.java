package _3.ObserverDesignPattern;

public interface StockObservable {
	public void add(NotificationAlertObserver observer);
	public void remove(NotificationAlertObserver observer);
	public void setStockCount(int newStockAdded);
	public int getStockCount();
	public String generateMsg();
	public void notifySubscribers();
}
