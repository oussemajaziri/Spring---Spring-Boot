package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import entity.Invoice;
import repository.InvoiceRepositoryMemory;
import repository.InvoiceRepositoryInterface;
import repository.InvoiceRepositoryDatabase;

public class InvoiceServicePrefix implements InvoiceServiceInterface {
	
	@Value ("${invoice.lastNumber}")
	private long lastNumber;
	@Value ("${invoice.prefix}")
	private String prefix ;
	@Autowired
	private InvoiceRepositoryInterface invoiceRepository; 
	
	
	public long getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(long lastNumber) {
		this.lastNumber = lastNumber;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}


	public InvoiceRepositoryInterface getInvoiceRepository() {
		return invoiceRepository;
	}


	public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}


	public void createInvoice (Invoice invoice) {
		invoice.setNumber(String.valueOf(prefix+(++lastNumber)));
		invoiceRepository.create(invoice);
	}

}
