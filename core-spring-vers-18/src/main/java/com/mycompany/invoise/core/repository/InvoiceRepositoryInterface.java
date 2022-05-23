package com.mycompany.invoise.core.repository;

import java.util.List;

import com.mycompany.invoise.core.entity.Invoice;

public interface InvoiceRepositoryInterface {

	void create (Invoice invoice);
	List<Invoice> list();
	
}
