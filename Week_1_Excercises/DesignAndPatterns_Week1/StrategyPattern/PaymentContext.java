package com.example.strategyPattern;

public class PaymentContext {
private PaymentStrategy payment;
public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.payment = paymentStrategy;
}

public void executePayment(double amount) {
    payment.pay(amount);
}
}
