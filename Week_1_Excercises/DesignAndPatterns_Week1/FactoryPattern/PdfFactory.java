package com.example.factory;
import java.util.*;

public class PdfFactory extends DocumentFactory{

	@Override
	public DocumentManager createDocument() {
		return new PdfDocument();
	}

}
