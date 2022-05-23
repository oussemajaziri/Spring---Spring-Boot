package com.mycompany.invoise.core.service.number;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.core.repository.memory.InvoiceRepositoryMemory;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

//@Service
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
	
	@Override
	public List<Invoice> getInvoiceList() {
		return invoiceRepository.list();
	}

}
