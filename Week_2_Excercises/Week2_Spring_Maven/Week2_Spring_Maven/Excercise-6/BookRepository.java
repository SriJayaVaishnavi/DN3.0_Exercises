package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void disp() {
        System.out.println("Book repository enabled");
    }
}
