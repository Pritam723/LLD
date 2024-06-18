package singleResposibility;

public class Main {
	public static void main(String[] args) {
		Marker marker1 = new Marker("M1", "Red", 2017, 50);
		Invoice inv1 = new Invoice(marker1, 32);
		inv1.printInvoice();
		InvoiceDao invDao = new InvoiceDao(inv1);
		
		invDao.saveToDB();
	}
}
