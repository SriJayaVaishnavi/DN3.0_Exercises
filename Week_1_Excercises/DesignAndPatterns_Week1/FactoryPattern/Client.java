package com.example.factory;
import java.util.*;

public class Client {
public static void main(String args[]) {
	DocumentFactory doc1=new WordFactory();
	DocumentManager dm1=doc1.createDocument();
	dm1.create();
	DocumentFactory doc2=new PdfFactory();
	DocumentManager dm2=doc2.createDocument();
	dm2.create();
	DocumentFactory doc3=new ExcelFactory();
	DocumentManager dm3=doc3.createDocument();
	dm3.create();
}
}
