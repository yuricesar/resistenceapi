package com.rebels.resistenceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rebels.resistenceapi.models.Rebel;

public interface RebelRepository extends JpaRepository<Rebel, Long> {
	
	Rebel findById(long id);
	
}
