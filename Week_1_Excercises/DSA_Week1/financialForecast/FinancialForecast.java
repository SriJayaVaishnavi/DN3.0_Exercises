package com.example.FinancialForecast;
import java.util.*;

public class FinancialForecast {
public double calculateFutureValue(double presentValue,double growthRate,int period) {
	if(period==0) {
		return presentValue;
	}
	return calculateFutureValue(presentValue,growthRate,period-1)*(1+growthRate);
}
public static void main(String[] args) {
	FinancialForecast f=new FinancialForecast();
	double present=1000.0;
	double growth=0.05;
	int periods=10;
	double futureval=f.calculateFutureValue(present,growth,periods);
	System.out.println(futureval);
}
}
