package org.scu_db.demo.service;

import org.scu_db.demo.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book findBookById(Integer Id);
    List<Book> findBookByIdUseSql(Integer Id);
    Integer deleteBookById(Integer id);
    List<Integer> findAllBorrowedBookId();
    List<String> findBooklessthan(Integer num);
    //Integer updateBook(Book book, Integer method);
}
