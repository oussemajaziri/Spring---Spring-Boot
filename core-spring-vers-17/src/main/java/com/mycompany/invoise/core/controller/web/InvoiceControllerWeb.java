package com.mycompany.invoise.core.controller.web;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.core.service.number.InvoiceServiceNumber;
import com.mycompany.invoise.core.service.prefix.InvoiceServicePrefix;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {
	
	
	@Autowired
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
	
	@RequestMapping("/invoice-home")
	public String displayHome() {
		System.out.println("La méthode displayHome a eté invoqué");
		return "index";
	}
}
