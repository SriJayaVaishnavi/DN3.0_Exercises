package com.library.aspect;
public class LoggingAspect{
	public void log(org.aspectj.lang.ProceedingJoinPoint joinpoint) throws Throwable{
		long start=System.currentTimeMillis();
		joinpoint.proceed();
		long end=System.currentTimeMillis();
		System.out.println("Method "+ joinpoint.getSignature()+" took "+(end-start)+" ms");
		
	}
}
