package com.example.command;

public class Test {
public static void main(String args[]) {
	Light livingRoom=new Light();
	Command on=new LightOnCommand(livingRoom);
	Command off=new LightOffCommand(livingRoom);
	RemoteControl rm=new RemoteControl();
	rm.set(on);
	rm.pressButton();
	
	rm.set(off);
	rm.pressButton();
}
}
