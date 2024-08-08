package com.library.app;

import com.library.config.AppConfig;
import com.library.service.BookService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        context.scan("com.library");
        BookService bookservice=context.getBean(BookService.class);
        bookservice.disp();
      
    }
}
