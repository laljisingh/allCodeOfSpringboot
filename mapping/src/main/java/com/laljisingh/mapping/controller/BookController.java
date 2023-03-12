package com.laljisingh.mapping.controller;


import com.laljisingh.mapping.model.Book;
import com.laljisingh.mapping.service.BookService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/add-book")
    public String addBook(@RequestBody String newBook){
        JSONObject json = new JSONObject(newBook);
        Book book = setBook(json);
        bookService.addBook(book);
        return book.toString();
    }

    private Book setBook(JSONObject json) {
        Book book = new Book();
        book.setTitle(json.getString("title"));
        book.setPrice(json.getString("price"));
        book.setAuthor(json.getString("author"));
        book.setDescription(json.getString("description"));

        book.setStudent(null);
        return book;
    }


}
