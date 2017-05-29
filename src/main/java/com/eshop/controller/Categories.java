package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoriesDao;
import com.eshop.model.CategoryDetails;



@Controller
public class Categories {
	@Autowired
	CategoriesDao cd;
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public ModelAndView cat()
	{
		CategoryDetails c=new CategoryDetails();
		return new ModelAndView("categories","CategoriesDetails",c);
	}
	
	@RequestMapping(value="/categories",method=RequestMethod.POST)
	public ModelAndView cat1(@ModelAttribute("CategoryDetails")CategoryDetails c)
	{
		
		return new ModelAndView("categories1","CategoryDetails",c);
	}
}
