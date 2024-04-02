package com.ktga.spring;

import org.springframework.stereotype.Component;

@Component
public class studentId implements IdCard {

	@Override
	public void details() {
		System.out.println("StudentId Called");

	}

}
