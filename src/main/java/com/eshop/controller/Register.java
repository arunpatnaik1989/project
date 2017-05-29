package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegisterDao;
import com.eshop.model.RegisterDetails;

@Controller
public class Register {
	@Autowired
	RegisterDao rd;
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String homeindex()
	{
		return "index1";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView reg()
	{
		RegisterDetails r=new RegisterDetails();
		return new ModelAndView("register","RegisterDetails",r);
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView reg1(@ModelAttribute("RegisterDetails")RegisterDetails r)
	{
		
		return new ModelAndView("register1","RegisterDetails",r);
	}
}
