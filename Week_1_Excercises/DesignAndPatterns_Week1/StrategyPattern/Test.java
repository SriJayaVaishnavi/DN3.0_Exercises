package com.example.strategyPattern;

public class Test {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

       
        PaymentStrategy creditCardPayment = new CreditCardPayment("18453947453434857293", "hellen", "123", "12/23");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(2454.23);

        
        PaymentStrategy payPalPayment = new PaypalPayment("jffh@edjfj.com", "secret56");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(385.90);
    }
}
