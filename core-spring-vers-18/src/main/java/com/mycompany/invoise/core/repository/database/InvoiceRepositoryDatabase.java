package com.mycompany.invoise.core.repository.database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
	
	private static List<Invoice> invoices = new ArrayList<>();
	
	public void create (Invoice invoice) {
		
		invoices.add(invoice);
		System.out.println("Data base Invoice added "+invoice.getNumber()+" for "+invoice.getCustomerName());
		
	}

	@Override
	public List<Invoice> list() {
		Invoice invoice1 = new Invoice();
		invoice1.setNumber("NUM_1");
		invoice1.setCustomerName("EDF");
		Invoice invoice2 = new Invoice();
		invoice2.setNumber("NUM_2");
		invoice2.setCustomerName("La poste");
		return List.of(invoice1,invoice2);
	}

}
