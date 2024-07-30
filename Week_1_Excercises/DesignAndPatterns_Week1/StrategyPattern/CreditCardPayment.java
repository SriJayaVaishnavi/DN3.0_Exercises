package com.example.strategyPattern;

public class CreditCardPayment implements PaymentStrategy{
private String cardNo;
private String cardHoldername;
private String cvv;
private String expiry;

public CreditCardPayment(String cardNo,String cardHoldername,String cvv, String expiry) {
	this.cardHoldername=cardHoldername;
	this.cardNo=cardNo;
	this.cvv=cvv;
	this.expiry=expiry;
}
public void pay(double amt) {
	System.out.println("Payment made using credicard"+" "+"amount "+amt);
}
}
