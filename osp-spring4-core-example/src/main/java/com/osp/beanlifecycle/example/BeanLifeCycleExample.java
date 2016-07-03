package com.osp.beanlifecycle.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleExample {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleBeanContext.xml");
		
		/*BeanLifeCycleBean beanLifeCycleBean = (BeanLifeCycleBean)context.getBean("springLifeCycleBean");
		System.out.println("BeanLifeCycle: "+beanLifeCycleBean.getName());
		*/

		
/*		CustomBeanLifeCycle cLifeCycle = (CustomBeanLifeCycle)context.getBean("customBeanDemo");
		
		System.out.println(cLifeCycle.getMessage());
*/		
		
		
		SpringLifeCycleBean beanLifeCycleBean = (SpringLifeCycleBean)context.getBean("springLifeCycleBean");
		System.out.println("BeanLifeCycle: "+beanLifeCycleBean.getMessage());
				
		context.registerShutdownHook();
	/*	
		SpringLifeCycleAnnotation beanLifeCycleBean = (SpringLifeCycleAnnotation)context.getBean("springLifeCycleBean");
		System.out.println("BeanLifeCycle: "+beanLifeCycleBean.getMessage());
		*/
		
		
	}
}
