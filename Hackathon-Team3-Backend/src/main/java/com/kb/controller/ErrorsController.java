package com.kb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kb.models.Errors;
import com.kb.service.ErrorService;

@RestController
@CrossOrigin
public class ErrorsController 
{
	private ErrorService eServ;
	
	
	@Autowired
	public ErrorsController(ErrorService es) 
	{
		eServ = es;	
	}
	
	
	@GetMapping(path="/getErrors")
	public ResponseEntity<List<Errors>> getAllErrors()
	{
		return new ResponseEntity<List<Errors>>(eServ.getAllErrors(), HttpStatus.OK);
	}
	
	@GetMapping(path="/getErrorsByName")
	public ResponseEntity<List<Errors>> getAllErrorsByUser(@RequestParam String un)
	{
		return new ResponseEntity<List<Errors>>(eServ.getAllErrorsByUserName(un), HttpStatus.OK);
	}
	
	@PostMapping(path="/saveErrors")
	public ResponseEntity<String> saveError(@RequestBody Errors er)
	{
		if(eServ.save(er))
		{
			return new ResponseEntity<String>("Error saved to database", HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<String>("Error was not saved to the database", HttpStatus.BAD_REQUEST);
		}
		
	}
	

}
