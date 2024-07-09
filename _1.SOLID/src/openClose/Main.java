package openClose;
// Open for Extension, Close for modification.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m1 = new Marker("M1", "Red", 2012, 100);
		Invoice inv1 = new Invoice(m1, 20);
		
		InvoiceDao invDao = new DB_DAO();
		invDao.save(inv1);
		
		invDao = new FILE_DAO();
		invDao.save(inv1);
	}

}
