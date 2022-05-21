package com.mycompany.invoise.core.controller;

import java.util.Scanner;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.core.service.InvoiceServiceNumber;

public class InvoiceControllerKeyboard implements InvoiceControllerInterface {
	
	private InvoiceServiceInterface invoiceService;
	
	
	public InvoiceServiceInterface getInvoiceService() {
		return invoiceService;
	}

	public void setInvoiceService(InvoiceServiceInterface invoiceService) {
		this.invoiceService = invoiceService;
	}

	
	public void createInvoice() {
        System.out.println( "Entrer le nom du client" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        
        invoiceService.createInvoice(invoice);
	}

}
