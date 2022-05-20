package repository;

import java.util.ArrayList;
import java.util.List;

import entity.Invoice;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
	
	private static List<Invoice> invoices = new ArrayList<>();
	
	public void create (Invoice invoice) {
		
		invoices.add(invoice);
		System.out.println("Data base Invoice added "+invoice.getNumber()+" for "+invoice.getCustomerName());
		
	}

}
