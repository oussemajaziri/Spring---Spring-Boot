package com.mycompany.invoise.core.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.invoise.core.entity.Invoice;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
	
	private static List<Invoice> invoices = new ArrayList<>();
	
	public void create (Invoice invoice) {
		
		invoices.add(invoice);
		System.out.println("Data base Invoice added "+invoice.getNumber()+" for "+invoice.getCustomerName());
		
	}

}
