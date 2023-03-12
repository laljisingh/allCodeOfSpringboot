package com.laljisingh.mapping.service;

import com.laljisingh.mapping.model.Book;
import com.laljisingh.mapping.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
