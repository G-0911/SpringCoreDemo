package com.ktga.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.ktga.spring")
public class AnnotationConfig {
	
//	@Bean
//	public student getstudent() {
//		return new student();
//	}
//	
//	@Bean
//	@Primary
//	public IdCard getStudentId() {
//		return new studentId();
//	}
//	
//	@Bean
//	public IdCard getTeacherId() {
//		return new studentId();
//	}
}
