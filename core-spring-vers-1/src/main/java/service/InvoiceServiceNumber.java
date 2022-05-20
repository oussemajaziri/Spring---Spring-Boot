package service;

import entity.Invoice;
import repository.InvoiceRepositoryMemory;
import repository.InvoiceRepositoryInterface;

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
