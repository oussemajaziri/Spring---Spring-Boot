package com.mycompany.invoise.core.service;

import java.util.List;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

	void createInvoice (Invoice invoice);
	List<Invoice> getInvoiceList ();
	void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
