package com.library.aspect;


public class LoggingAspect{
	public void log_before() {
	System.out.println("Concerning before method's execution");
	}
	public void log_after() {
		System.out.println("Concerning after method's execution");
		}
}
