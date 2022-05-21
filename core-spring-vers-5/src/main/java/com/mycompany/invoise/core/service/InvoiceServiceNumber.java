package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.repository.InvoiceRepositoryMemory;

public class InvoiceServiceNumber implements InvoiceServiceInterface{
	
	private static long lastNumber = 0l;
	
	private InvoiceRepositoryInterface invoiceRepository; 
	
	
	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}



	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}



	public void createInvoice (Invoice invoice) {
		invoice.setNumber(String.valueOf(++lastNumber));
		invoiceRepository.create(invoice);
	}

}
