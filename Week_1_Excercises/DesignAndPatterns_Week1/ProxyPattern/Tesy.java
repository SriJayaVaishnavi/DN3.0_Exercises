package com.example.ProxyPatternExample;

public class Tesy {
public static void main(String args[]) {
	Image img1=new ProxyImage("image1.jpg");
	Image img2=new ProxyImage("image2.jpg");
	
	img1.display();
	img1.display();
	img2.display();
	img2.display();
}
}
