package com.kb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Errors")
public class Errors 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "errorID") 
	private int errorID;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "solution")
	private String solution;
	
	@Column(name = "submitterFirstName")
	private String submitterFirstName;
	
	@Column(name = "submitterLastName")
	private String submitterLastName;
	
	public Errors() 
	{
		
	}
	
	public Errors(String description, String solution, String submitterFirstName, String submitterLastName) {
		super();
		this.description = description;
		this.solution = solution;
		this.submitterFirstName = submitterFirstName;
		this.submitterLastName = submitterLastName;
	}





	public int getErrorID() {
		return errorID;
	}

	public void setErrorID(int errorID) {
		this.errorID = errorID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getSubmitterFirstName() {
		return submitterFirstName;
	}

	public void setSubmitterFirstName(String submitterFirstName) {
		this.submitterFirstName = submitterFirstName;
	}

	public String getSubmitterLastName() {
		return submitterLastName;
	}

	public void setSubmitterLastName(String submitterLastName) {
		this.submitterLastName = submitterLastName;
	}



	@Override
	public String toString() 
	{
		return "Error [errorID=" + errorID + ", description=" + description + ", solution=" + solution
				+ ", submitterFirstName=" + submitterFirstName + ", submitterLastName=" + submitterLastName + "]";
	}
	
	
	
	
}
