package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.RegisterDetails;

@Repository
public class RegisterDao {
	@Autowired
	SessionFactory sf;
	public void regDetails (RegisterDetails regd)
	{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(regd);
	t.commit();
	}

}
