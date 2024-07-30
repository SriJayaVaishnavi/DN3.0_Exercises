package com.example.decorator;

public class Test {
public static void main(String args[]) {
	Notifier notifer = new EmailNotifier();
	notifer.send("hola");
	
	Notifier sendEmail=new SMSNotifierDecorator(notifer);
	

	Notifier sendSlack=new SlackNotifierDecorator(notifer);
	sendEmail.send("hola sms!");
	sendSlack.send("hola slack");
}
}
