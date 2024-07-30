package com.example.observer;

public class WebApp implements Observer {
    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("Web App: Stock " + stockSymbol + " price updated to Rs" + price);
    }
}