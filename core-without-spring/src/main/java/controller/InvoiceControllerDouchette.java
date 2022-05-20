package controller;

import java.util.Scanner;

import entity.Invoice;
import service.InvoiceServiceNumber;
import service.InvoiceServiceInterface;

public class InvoiceControllerDouchette implements InvoiceControllerInterface {
	
	private InvoiceServiceInterface invoiceService;
	
	
	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	@Override
	public void createInvoice() {
        System.out.println( "Usage de scanner" );
 
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virgin Galactic");
        
        invoiceService.createInvoice(invoice);
	}

}
