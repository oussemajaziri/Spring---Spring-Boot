package com.mycompany.invoise.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.invoise.core.controller.InvoiceControllerInterface;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;
import com.mycompany.invoise.core.service.prefix.InvoiceServicePrefix;



/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.mycompany.invoise.core.controller.web",
		/** "com.mycompany.invoise.core.service.prefix",*/ "com.mycompany.invoise.core.repository.database" })
@PropertySource("classpath:application.properties")
public class App {
	public static void main(String[] args) {
		 
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);
		
		
		
		invoiceController.createInvoice();
		
		
	}
	
	@Bean
	public InvoiceServiceInterface ConfigueInvoiceService () {
		return new InvoiceServicePrefix();
	}
}
