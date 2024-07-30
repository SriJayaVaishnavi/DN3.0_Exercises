package com.example.strategyPattern;

public class PaypalPayment implements PaymentStrategy{

	private String email;
	private String passwrod;
	public PaypalPayment(String email,String password) {
		this.email=email;
		this.passwrod=password;
	}
	public void pay(double amt) {
		System.out.println("payment made using paypal\n"+"Amount: "+amt);
		
	}

}
