package com.library.app;

import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookServiceViaConstructor");
       
        System.out.println("Enabling BookService Via Constructor");
        bookService.disp();
        
        BookService bookService2 = (BookService) context.getBean("bookServiceViaSetter");
        
        System.out.println("Enabling BookService Via Setter");
        bookService2.disp();
       
        
      
    }
}
