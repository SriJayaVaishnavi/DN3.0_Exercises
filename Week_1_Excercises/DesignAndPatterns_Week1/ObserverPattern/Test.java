package com.example.observer;

public class Test {
    public static void main(String[] args) {
        
        StockMarket stockMarket = new StockMarket();

       
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

       
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        
        stockMarket.setStockData("hola", 150.00);
        stockMarket.setStockData("koala", 2800.00);
    }
}
