package com.test.doubles.fake;

import java.util.Collection;
import java.util.List;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAllBook();
}
