package com.example.ProxyPatternExample;

public class RealImage implements Image{

	private String file;
	
	public RealImage(String file) {
		this.file=file;
		loadFromRemoteServer(file);
	}
	
	private void loadFromRemoteServer(String file) {
		System.out.println("Loading "+file+" from a server which is remote");
		try {
			Thread.sleep(2000);
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(file+" loaded.");
	}
	@Override
	public void display() {
		System.out.println(file);
		
	}

}
