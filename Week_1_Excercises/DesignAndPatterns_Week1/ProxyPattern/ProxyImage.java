package com.example.ProxyPatternExample;

public class ProxyImage implements Image{
	private String file;
	private RealImage realimg;
	
	public ProxyImage(String file)
	{
		this.file=file;
	}

	@Override
	public void display() {
		if(realimg==null) {
			realimg=new RealImage(file);
		}
		realimg.display();
	}

}
