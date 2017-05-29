package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupplierDao;

import com.eshop.model.SupplierDetails;

@Controller
public class Supplier {
@Autowired
SupplierDao sd;
@RequestMapping(value="/supplier",method=RequestMethod.GET)
public ModelAndView sup()
{
	SupplierDetails s=new SupplierDetails();
	return new ModelAndView("supplier","SupplierDetails",s);
}

@RequestMapping(value="/supplier",method=RequestMethod.POST)
public ModelAndView sup1(@ModelAttribute("SupplierDetails")SupplierDetails s)
{
	
	return new ModelAndView("supplier1","SupplierDetails",s);
}
}
