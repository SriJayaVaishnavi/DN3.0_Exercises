package com.example.adap;
import java.util.*;

public class GpayAdapter implements PaymentProcessor {
	private Gpay gpay;
	public GpayAdapter() {
	this.gpay=new Gpay();
	}

	@Override
	public void processPayment() {
		gpay.GpayPayment();
		
	}

}
