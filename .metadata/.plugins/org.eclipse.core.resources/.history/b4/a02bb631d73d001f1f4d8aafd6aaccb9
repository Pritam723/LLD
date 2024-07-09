package singleResposibility;

public class Invoice {
	Marker marker;
	int qty;
	
	Invoice(Marker marker, int qty){
		this.marker = marker;
		this.qty = qty;
	}
	
	public int calculateTotal() {
		return marker.price * qty;
	}
	
	public void printInvoice() {
		int total = this.calculateTotal();
		System.out.println("Invoice printed of value " + total);
	}
}
