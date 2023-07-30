package com.team_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team_app.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
