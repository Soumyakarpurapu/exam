package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.QueryMaster;
import com.cg.service.QueryService;

@Controller
public class QueryContoller 
{
	@Autowired
	QueryService queSer;
	@RequestMapping(value="run",method=RequestMethod.GET)
	public String sayHello(@ModelAttribute("queryId")QueryMaster query,BindingResult result)
	{
		return "SearchQuery";
	}
	@RequestMapping(value="searchQu",method=RequestMethod.GET)
	public ModelAndView updateQuery(@ModelAttribute("update")QueryMaster queryId,Map<String,Object> model )
	{
		QueryMaster queryList=queSer.findOne(queryId);
		 model.put("Answered by:", new String[] { "Uma", "Rahul", "Kavita", "Hema" });		
		return new ModelAndView("Success");
		
	}
}
