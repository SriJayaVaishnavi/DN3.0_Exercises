package com.example.decorator;

public abstract class NotifierDecorator implements Notifier{
private Notifier Notify;
public NotifierDecorator(Notifier notify) {
	this.Notify=notify;
}

@Override
public  void send(String message) {
	Notify.send(message);
	
}
}
