package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {

	void createInvoice (Invoice invoice);
	void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
