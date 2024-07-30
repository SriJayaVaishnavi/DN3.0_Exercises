package com.example.command;

public class RemoteControl {
private Command command;

public void set(Command command) {
	this.command=command;
}

public void pressButton() {
	command.execute();
}
}
