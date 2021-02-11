package com.kb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kb.dao.ErrorRepo;
import com.kb.models.Errors;

/**
 * Serivce for the Errors model.
 * @author Albert
 *
 */
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
	
	/**
	 * Inserts a bug into the database
	 * @param er
	 * @return true if the save method returns the object
	 */
	public boolean save(Errors er)
	{
		
		try
		{
			Errors insertedBug = eR.save(er);
			return true;
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Bug save failed.");
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	/**
	 * Gets all the bugs in the system
	 * @return a list of bugs
	 */
	public List<Errors> getAllErrors()
	{
		return eR.findAll(); 
	}
	
	public Errors getErrorByID(int id)
	{
		return eR.findById(id).get();
	}
	
	public List<Errors> getAllErrorsByUserName(String un)
	{
		
		return eR.findAllByUserName(un);
	}
	
	
	
	
	
}
