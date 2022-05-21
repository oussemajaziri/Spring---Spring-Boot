package com.mycompany.invoise.core.controller.scan;

import java.util.Scanner;

import org.springframework.stereotype.Controller;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.core.service.number.InvoiceServiceNumber;

@Controller
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
