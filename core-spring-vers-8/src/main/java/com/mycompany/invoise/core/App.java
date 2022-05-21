package com.mycompany.invoise.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		 
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class,AppConfigPropertySource.class);
		
		InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);
		
		
		
		invoiceController.createInvoice();
		
		
	}
}
