package org.dn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggigAspectPointcut {

	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Adice run,Get Circle getName method called...");
	}
	
	@Before("allGetters()")
	private void secondAdvice() {
		System.out.println("Second Advuce Executed..");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	//this is should be empty method for pointcut
}