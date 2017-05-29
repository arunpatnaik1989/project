package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.AdministrationDao;
import com.eshop.model.AdministrationDetails;


@Controller
public class Administration {
@Autowired
AdministrationDao ad;

@RequestMapping(value="/admin",method=RequestMethod.GET)
public ModelAndView adm()
{
	AdministrationDetails a=new AdministrationDetails();
	return new ModelAndView("admin","AdministrationDetails",a);
}

@RequestMapping(value="/admin",method=RequestMethod.POST)
public ModelAndView adm1 (@ModelAttribute("AdministrationDetails")AdministrationDetails a)
{
	
	return new ModelAndView("admin","AdministrationDetails",a);
}
}
