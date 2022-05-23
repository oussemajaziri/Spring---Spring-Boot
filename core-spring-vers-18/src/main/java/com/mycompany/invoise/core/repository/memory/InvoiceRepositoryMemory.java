package com.mycompany.invoise.core.repository.memory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
	
	private static List<Invoice> invoices = new ArrayList<>();
	
	public void create (Invoice invoice) {
		
		invoices.add(invoice);
		System.out.println("Invoice added "+invoice.getNumber()+" for "+invoice.getCustomerName());
		
	}

	@Override
	public List<Invoice> list() {
		throw new UnsupportedOperationException();
	}

}
