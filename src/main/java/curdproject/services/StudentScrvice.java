package curdproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curdproject.controller.Registeration;
import curdproject.repository.JpaRepo;

@Service
public class StudentScrvice {
	@Autowired
	JpaRepo jpa;
	public Registeration addData(Registeration regi ) {
		return this.jpa.save(regi);
	}

}
//create with interface