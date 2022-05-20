package service;

import entity.Invoice;
import repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

	void createInvoice (Invoice invoice);
	void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
