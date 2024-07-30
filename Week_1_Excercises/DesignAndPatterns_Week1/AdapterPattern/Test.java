package com.example.adap;
import java.util.*;
import java.util.Scanner;

public class Test {
public static void main(String args[]) {
	System.out.println("Enter the 3rd party payment mode:\n GPAY/Phonepay/MakePayment");
	Scanner s=new Scanner(System.in);
	String opt=s.next().toLowerCase();
	PaymentProcessor processpay;
	switch(opt){
		case "gpay":
		{
			processpay=new GpayAdapter();
			
			break;
		}
		case "phonepe":
		{
			processpay=new PhonepeAdapter();
			
			break;
		}
		case "makepayment":
		{
			processpay=new MakePaymentAdapter();
			
			break;
		}
		
		default:
		{
			System.out.println("kindly enter a valid payment option");
			return;
		}
		
	}
	processpay.processPayment();
	
}
}
