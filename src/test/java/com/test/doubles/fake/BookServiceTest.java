package com.test.doubles.fake;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookServiceTest {


    @Test
    void TestNumberOfBooks() {
        BookRepository bookRepository=new FakeBookRepository();
        BookService bookService=new BookService(bookRepository);
        bookService.addBooks(new Book(1,"King Leopard",120.0, LocalDate.now()));
        bookService.addBooks(new Book(2,"Story of Ramayana",500.33, LocalDate.now()));
        assertEquals(2,bookService.numberOfBooks());
    }
}