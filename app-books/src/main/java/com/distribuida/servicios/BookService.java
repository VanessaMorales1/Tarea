package com.distribuida.servicios;

import com.distribuida.db.Books;

import java.util.List;

public interface BookService {
    List<Books> findAll();
    Books findById(Integer id);
    void create(Books books);
    void deleteByID(Integer id);
    void update(Integer id, Books books);

}

