package com.test.doubles.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository{
    //Fake object to store the book info instead of calling actual database ..

    Map<Integer,Book> bookStore=new HashMap<>();

    @Override
    public void save(Book book) {
        bookStore.put(book.getBookId(),book);
    }

    @Override
    public Collection<Book> findAllBook() {
        return bookStore.values();
    }
}
