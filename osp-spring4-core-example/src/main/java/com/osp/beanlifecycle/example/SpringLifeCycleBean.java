package com.osp.beanlifecycle.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringLifeCycleBean implements InitializingBean,DisposableBean {

	String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method after properties are set : " + message);
	}
	
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("Spring Container is destroy! Customer clean up");
	}
	
	
}
