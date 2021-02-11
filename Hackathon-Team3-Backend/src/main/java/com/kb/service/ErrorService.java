package com.kb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kb.dao.ErrorRepo;
import com.kb.models.Errors;


@Service
public class ErrorService 
{
	private ErrorRepo eR;
	
	
	public ErrorService() 
	{
		
	}
	
	@Autowired
	public ErrorService(ErrorRepo eR) 
	{
		this.eR = eR;
	}
	
	public void save(Errors er)
	{
		eR.save(er);
	}
	
	public List<Errors> getAllErrors()
	{
		return eR.findAll(); 
	}
	
	public Errors getErrorByID(int id)
	{
		return eR.findById(id).get();
	}
	
	
	
	
	
}
