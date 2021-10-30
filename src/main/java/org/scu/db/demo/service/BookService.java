package org.scu.db.demo.service;


import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BookService {
    //List<Book> findAllBooks();
    //List<Map> query_call_and_count();
    List<Integer> findAllBorrowedBooksId();
    List<Title> findIliadOrOdysseyTitle();
    Integer countCall123Book();
    List<String> findCountNotExceed2Callnumber();
}
