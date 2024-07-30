package com.example.singleton;
import java.util.*;

public class Test {
public static void main(String args[]) {
	Logger l1=Logger.getInstance();
	Logger l2=Logger.getInstance();
	System.out.println("1st instance:"+l1);
	System.out.println("2nd instance:"+l2);
	if(l1==l2) {
		System.out.println("Singleton pattern is properly implemented, A single instance"
				+ " is created");
	}
	else {
		System.out.println("Incorrect singleton pattern implementation");
	}
}
}
