package com.example.singleton;
import java.util.*;

public class Logger {
private static Logger obj;
private Logger() {}
public static Logger getInstance() {
	if(obj==null) {
		synchronized (Logger.class) {
			if(obj==null) {
				obj=new Logger();
			}
		}
	}
	return obj;
}
}
