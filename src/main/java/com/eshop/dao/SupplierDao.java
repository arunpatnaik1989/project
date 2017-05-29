package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.SupplierDetails;



@Repository
public class SupplierDao {
	@Autowired
	SessionFactory sf;
	public void supDetails (SupplierDetails supd)
	{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(supd);
	t.commit();
	}
}
