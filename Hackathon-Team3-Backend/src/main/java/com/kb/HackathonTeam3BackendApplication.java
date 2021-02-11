package com.kb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kb.dao.ErrorRepo;
import com.kb.models.Errors;
import com.kb.service.ErrorService;

@SpringBootApplication
public class HackathonTeam3BackendApplication {

	public static void main(String[] args) {

		
//		  Errors err1 = new Errors("Blue Screen", "Bought a new computer", "Jeffrey",
//		  "Jefferson"); ErrorService eServ = new ErrorService(new ErrorRepo);
//		  eServ.save(err1);
		 

		SpringApplication.run(HackathonTeam3BackendApplication.class, args);
	}

}
