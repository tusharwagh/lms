package com.lms.book.entity;

import com.lms.book.model.Book;
import com.lms.book.model.ISBN;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookEntity {

    @Id
    private String isbn;
    @Column
    private String title;

    public BookEntity(Book book) {
        this.isbn = book.getIsbn().getIsbnNumber();
        this.title = book.getTitle();
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                '}';
    }
}