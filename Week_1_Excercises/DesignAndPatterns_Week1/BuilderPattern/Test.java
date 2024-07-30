package com.example.BuilderPatternExample;
import java.util.*;

public class Test {
public static void main(String args[]) {
	Computer builder=new Computer.Builder().setCPU("Intel i4").setRAM(4000).build();
	Computer builder2=new Computer.Builder().setStorage(1000).build();
	System.out.println("CPU TYPE: "+builder.getCPU()+"\nRAM CAPACITY: "+builder.getRAM()+" \n"
			+ "Storage capacity: "+builder.getStorage());
	System.out.println("CPU TYPE: "+builder2.getCPU()+"\nRAM CAPACITY: "+builder2.getRAM()+" \n"
			+ "Storage capacity: "+builder2.getStorage());
	
}
}
