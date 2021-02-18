package com.example.demo.Service;

import com.example.demo.DAO.BookDAO;
import com.example.demo.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;
    public Collection<Book> getBooks(){
        Collection<Book> books;
        return bookDAO.getBooks();
    }
    public Book createBooks(Book book){

        return bookDAO.createBooks(book);
    }

}
