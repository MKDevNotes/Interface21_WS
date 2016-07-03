package org.dn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggigAspectCircle {

	//Aspect for particular class name
	@Before("execution(public String com.osp.aop.model.Circle.getName())")
	public void LoggingAdvice() {
		System.out.println("Adice run,Get Circle getName method called...");
	}
}