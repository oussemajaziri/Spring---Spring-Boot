package controller;

import java.util.Scanner;

import entity.Invoice;
import service.InvoiceServiceNumber;
import service.InvoiceServiceInterface;

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
