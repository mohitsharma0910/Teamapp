package com.team_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.team_app.entities.Lead;
import com.team_app.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	//http://localhost:8080/viewCreateLead
	
	@RequestMapping("/viewCreateLead")
	public String viewCreateLeadForm() {
	return"create_registration";
	}
	
	
	@RequestMapping("/saveLead")
	public String saveOneLead(Lead lead) {
		leadService.saveLead(lead);
		return"create_registration";
		
	}


}
