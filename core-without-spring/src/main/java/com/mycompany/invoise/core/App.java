package com.mycompany.invoise.core;

import java.util.Scanner;

import java.lang.*;  

import controller.InvoiceControllerKeyboard;
import controller.InvoiceControllerDouchette;
import controller.InvoiceControllerInterface;
import controller.InvoiceControllerWeb;
import entity.Invoice;
import repository.InvoiceRepositoryMemory;
import repository.InvoiceRepositoryDatabase;
import repository.InvoiceRepositoryInterface;
import service.InvoiceServiceInterface;
import service.InvoiceServiceNumber;
import service.InvoiceServicePrefix;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		 
	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est la classe du controller");   
		String controllerClass = sc.nextLine();					//exemple: controller.InvoiceControllerDouchette

		System.out.println("Quel est la classe du service");
		String serviceClass = sc.nextLine(); 					//exemple: service.InvoiceServiceNumber

		System.out.println("Quel est la classe de repository");
		String repositoryClass = sc.nextLine();					//exemple: repository.InvoiceRepositoryDatabase

		InvoiceControllerInterface invoiceController=null;
		

		InvoiceServiceInterface invoiceService=null;
		

		InvoiceRepositoryInterface invoiceRepository=null;
		
	
			
		try {
		invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
		invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
		invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
		} catch  (Exception e) {
			
		}
		

		invoiceController.setInvoiceService(invoiceService);
		invoiceService.setInvoiceRepository(invoiceRepository);

	
		
		invoiceController.createInvoice();
		
		
	}
}
