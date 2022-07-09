package com.test.doubles.fake;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBooks(Book book){
        bookRepository.save(book);
    }

    public int numberOfBooks(){
        return bookRepository.findAllBook().size();
    }
}
