package controller;

import service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

	void createInvoice();
	void setInvoiceService(InvoiceServiceInterface invoiceService);
}
