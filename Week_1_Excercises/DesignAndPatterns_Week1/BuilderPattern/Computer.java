package com.example.BuilderPatternExample;
import java.util.*;
public class Computer {
private String CPU;
private int RAM;
private int Storage;
private Computer(Builder builder) {
	this.CPU=builder.CPU;
	this.RAM=builder.RAM;
	this.Storage=builder.Storage;
	

}

public String getCPU() {
	return CPU;
}


public int getRAM() {
	return RAM;
}

public int getStorage() {
	return Storage;
}

public static class Builder{
	
	
	public  int Storage = 0;
	public  int RAM = 0;
	public  String CPU= null;
	public Builder setCPU(String cpu) {
		this.CPU=cpu;
		return this;
	}
	public Builder setStorage(int Storage) {
		this.Storage=Storage;
		return this;
	}
	public Builder setRAM(int RAM) {
		this.RAM=RAM;
		return this;
	}
	public Computer build() {
		return new Computer(this);
	}
	
	}
}

