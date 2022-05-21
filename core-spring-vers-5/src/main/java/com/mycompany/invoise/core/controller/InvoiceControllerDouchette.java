package com.mycompany.invoise.core.controller;

import java.util.Scanner;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.core.service.InvoiceServiceNumber;

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
