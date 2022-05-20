package controller;

import java.util.Scanner;

import entity.Invoice;
import service.InvoiceServiceNumber;
import service.InvoiceServiceInterface;
import service.InvoiceServicePrefix;

public class InvoiceControllerWeb implements InvoiceControllerInterface {
	
	private InvoiceServiceInterface invoiceService;
	
	

	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}


	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}



	public void createInvoice() {
 
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        
        invoiceService.createInvoice(invoice);
	}
}



