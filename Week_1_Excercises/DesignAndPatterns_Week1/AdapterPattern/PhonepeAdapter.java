package com.example.adap;
import java.util.*;

public class PhonepeAdapter implements PaymentProcessor {

	private Phonepe phonepe;
	public PhonepeAdapter() {
	this.phonepe=new Phonepe();
	}
	@Override
	public void processPayment() {
		
		phonepe.PhonepePayment();
	}

}
