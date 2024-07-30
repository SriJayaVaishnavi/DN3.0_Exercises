package com.example.factory;
import java.util.*;

public class WordFactory extends DocumentFactory {
	
	@Override
	public DocumentManager createDocument() {
		return new WordDocument();
	}
}
