package com.ktga.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
//     	  BeanFactory or ApplicationContext
//     	  BeanFactory bean = new ClassPathXmlApplicationContext("Spring.xml"); // default it go search for specified xml file in src/main/resources
//    	  student st = bean.getBean(student.class);
//    	  st.setId1(101);
//    	  System.out.println(st.getId1());
//   	  st.call();
        
//        student st2 = bean.getBean(student.class);
//        System.out.println(st2.getId1());
        
        
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        student st1 = factory.getBean(student.class);
        st1.call();
 
    }
}
