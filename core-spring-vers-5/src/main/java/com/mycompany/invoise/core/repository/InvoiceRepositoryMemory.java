package com.mycompany.invoise.core.repository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.invoise.core.entity.Invoice;

public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
	
	private static List<Invoice> invoices = new ArrayList<>();
	
	public void create (Invoice invoice) {
		
		invoices.add(invoice);
		System.out.println("Invoice added "+invoice.getNumber()+" for "+invoice.getCustomerName());
		
	}

}
