package com.distribuida.servicios;

import com.distribuida.db.Books;
import com.distribuida.repository.BookRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class BookServiceImpl implements BookService {

    @Inject
    private BookRepository bookRepository;

    @Override
    public List<Books> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public void create(Books books) {

        bookRepository.create(books);
    }

    @Override
    public void deleteByID(Integer id) {

        bookRepository.deleteById(id);
    }


    @Override
    public void update(Integer id, Books books) {
        bookRepository.update(id, books);
    }
}