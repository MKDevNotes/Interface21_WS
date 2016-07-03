package com.osp.autowireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.osp.autowireByName.EmployeeBean;

public class AutoWireByNameExample {
	public static void main(String[] args) {
		ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"autowireByTypeContext.xml"});
		//http://howtodoinjava.com/spring/spring-core/spring-bean-autowire-byname/
      EmployeeBean employee = (EmployeeBean)context.getBean("employeeBean");
      
      System.out.println(employee.getFullName());
      System.out.println(employee.getDepartmentBean().getName());
	}
}
