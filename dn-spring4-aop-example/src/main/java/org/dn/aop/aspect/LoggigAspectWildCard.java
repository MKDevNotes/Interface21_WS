package org.dn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggigAspectWildCard {

	@Before("execution(public * get*())")
	public void LoggingAdvice() {
		System.out.println("Adice run,Get Circle getName method called...");
	}
}