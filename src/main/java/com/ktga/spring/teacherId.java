package com.ktga.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class teacherId implements IdCard {

	@Override
	public void details() {
		System.out.println("Teacher Id Called");

	}

}
