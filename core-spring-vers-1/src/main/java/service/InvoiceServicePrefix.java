package service;

import entity.Invoice;
import repository.InvoiceRepositoryMemory;
import repository.InvoiceRepositoryInterface;
import repository.InvoiceRepositoryDatabase;

public class InvoiceServicePrefix implements InvoiceServiceInterface {
	
	private static long lastNumber = 112l;
	
	private InvoiceRepositoryInterface invoiceRepository; 
	
	
	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}


	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}


	public void createInvoice (Invoice invoice) {
		invoice.setNumber(String.valueOf("INV_"+(++lastNumber)));
		invoiceRepository.create(invoice);
	}

}
