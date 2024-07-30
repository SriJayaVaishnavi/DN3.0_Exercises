package com.example.adap;
import java.util.*;

public class MakePaymentAdapter implements PaymentProcessor{

	private MakePayment makepayment;
	public MakePaymentAdapter() {
	this.makepayment=new MakePayment();
	}
	@Override
	public void processPayment() {
		makepayment.MakepayPayment();
		
	}

}
