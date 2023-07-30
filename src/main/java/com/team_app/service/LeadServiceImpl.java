package com.team_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team_app.entities.Lead;
import com.team_app.repositories.LeadRepository;


@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

}
