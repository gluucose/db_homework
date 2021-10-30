package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.scu.db.demo.model.Book;
import org.scu.db.demo.model.Title;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    //List<Book> queryBook();
    //List<Map> query_call_and_count();
    List<Integer> query_borrowed_book_id();
    List<Title> query_iliad_or_odyssey_Title();
    Integer query_count_call123();
    List<String> query_count_not_exceed_2_callnumber();
}
