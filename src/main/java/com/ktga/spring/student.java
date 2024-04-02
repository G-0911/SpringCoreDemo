package com.ktga.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class student {
	
	@Autowired 
	@Qualifier("studentId")
	IdCard id;
	int id1;
	
	public student() { // always called by spring container
		 //System.out.println("Constructor called");
	}

//	public student(int id1) {
//		this.id1 = id1;
//	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		System.out.println("Setter Method Called");
		this.id1 = id1;
	}
	
	public IdCard getId() {
		return id;
	}

	public void setId(IdCard id) {
		this.id = id;
	}

	void call() {
		//System.out.println("Method Called...");
		id.details();
	}
}
