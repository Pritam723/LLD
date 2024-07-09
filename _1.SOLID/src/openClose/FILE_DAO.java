package openClose;

public class FILE_DAO implements InvoiceDao {
	// public Invoice inv;
	@Override
	public void save(Invoice inv) {
		System.out.println("Invoice of value " + inv.calculateTotal() + " is saved to File");
	}
}