package com.kb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kb.models.Errors;

@Repository
public interface ErrorRepo extends JpaRepository<Errors, Integer>
{
	
}
