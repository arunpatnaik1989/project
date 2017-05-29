package com.eshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.eshop.model.CategoryDetails;
@Repository
public class CategoriesDao {
	@Autowired
	SessionFactory sf;
	public void catDetails (CategoryDetails catd)
	{
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	s.save(catd);
	t.commit();
	}
}
