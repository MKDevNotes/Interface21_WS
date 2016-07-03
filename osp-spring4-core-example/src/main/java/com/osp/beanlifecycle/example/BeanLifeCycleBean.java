package com.osp.beanlifecycle.example;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;

public class BeanLifeCycleBean implements ApplicationContextAware,
ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
NotificationPublisherAware, ResourceLoaderAware,ImportAware {

	/* ApplicationContextAware,
     ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
     BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware*/
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub
		
		 System.out.println("setApplicationContext called");
	        System.out.println("setApplicationContext:: Bean Definition Names="
	                + Arrays.toString(ctx.getBeanDefinitionNames()));
		
	}
	
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub

        System.out.println("setApplicationEventPublisher called");
	}
	
	public void setBeanClassLoader(ClassLoader classLoader) {
		// TODO Auto-generated method stub
		 System.out.println("setBeanClassLoader called");
	        System.out.println("setBeanClassLoader:: ClassLoader Name="
	                + classLoader.getClass().getName());
	}
	
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		 System.out.println("setBeanFactory called");
	        System.out.println("setBeanFactory:: springLifeCycleBean bean singleton="
	                + beanFactory.isSingleton("springLifeCycleBean"));
	}
	
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
	       System.out.println("setBeanName called");
	        System.out.println("setBeanName:: Bean Name defined in context="
	                + beanName);
	}
	
	public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
		// TODO Auto-generated method stub
		System.out.println("setLoadTimeWeaver "+arg0);
	}
	
	public void setMessageSource(MessageSource arg0) {
		// TODO Auto-generated method stub
		System.out.println("setMessageSource "+arg0);
	}
	
	public void setNotificationPublisher(NotificationPublisher arg0) {
		// TODO Auto-generated method stub
		System.out.println("setNotificationPublisher "+arg0);
	}
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		 System.out.println("setResourceLoader called");
	        Resource resource = resourceLoader.getResource("classpath:beanLifeCycleBeanContext.xml");
	        System.out.println("setResourceLoader:: Resource File Name="
	                + resource.getFilename());
	}
	
	public void setImportMetadata(AnnotationMetadata arg0) {
		// TODO Auto-generated method stub
		  System.out.println("setImportMetadata called");
	}
	
}
