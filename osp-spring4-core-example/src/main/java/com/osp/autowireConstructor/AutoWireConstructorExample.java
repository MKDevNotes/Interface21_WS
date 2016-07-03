package com.osp.autowireConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutoWireConstructorExample {
	public static void main(String[] args) {
		ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"autowireConstructorContext.xml"});
		//http://howtodoinjava.com/spring/spring-core/spring-bean-autowire-byname/
      EmployeeBean employee = (EmployeeBean)context.getBean("employeeBean");
      
      System.out.println(employee.getFullName());
      System.out.println(employee.getDepartmentBean().getName());
	}
}
