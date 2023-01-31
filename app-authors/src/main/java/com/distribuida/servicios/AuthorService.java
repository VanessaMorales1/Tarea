package com.distribuida.servicios;

import com.distribuida.db.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author findById(Long id);

    void delete(Long id);
    void update(Long id, Author author);
    void create(Author author);
}
