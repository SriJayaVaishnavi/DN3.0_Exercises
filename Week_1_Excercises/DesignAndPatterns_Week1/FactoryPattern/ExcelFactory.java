package com.example.factory;
import java.util.*;

public class ExcelFactory extends DocumentFactory{

	@Override
	public DocumentManager createDocument() {
		return new ExcelDocument();
	}

}
