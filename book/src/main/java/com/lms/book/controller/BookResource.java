package com.lms.book.controller;

import com.lms.book.model.Book;
import com.lms.book.model.ISBN;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/book")
public interface BookResource {

    @RequestMapping("/register")
    public Book register(@RequestParam Book book);

    public ISBN deRegister(@RequestParam ISBN isbnNumber);
}
