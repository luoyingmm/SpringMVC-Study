package com.luoyingmm.service;

import com.luoyingmm.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById( int id);

    List<Books> queryAllBook();
}
