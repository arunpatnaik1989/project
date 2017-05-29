package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.AdministrationDetails;


@Repository
public class AdministrationDao {
	@Autowired
	SessionFactory sf;
	public void admDetails (AdministrationDetails admd)
	{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(admd);
	t.commit();
	}

}
