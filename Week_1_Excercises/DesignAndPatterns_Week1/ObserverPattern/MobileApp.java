package com.example.observer;

public class MobileApp implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Mobile App: Stock " + stockSymbol + " price updated to Rs" + price);
    }
}