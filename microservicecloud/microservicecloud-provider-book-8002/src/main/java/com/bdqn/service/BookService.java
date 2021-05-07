package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.Book;

public interface BookService {
    List<Book> getBooks();
    Book getBookById(int bid);
    int updateBook(Book book);
    int removeBoodById(int bid);
    int addBook(Book book);
}
