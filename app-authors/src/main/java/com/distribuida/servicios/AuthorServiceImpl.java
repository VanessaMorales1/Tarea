package com.distribuida.servicios;

import com.distribuida.db.Author;
import com.distribuida.repository.AuthorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
@ApplicationScoped
@Transactional
public class AuthorServiceImpl implements AuthorService {
    @Inject
    AuthorRepository authorRepository;
    @Override
    public List<Author> findAll() {
        return authorRepository.findAll().list();

    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public void update (Long id, Author author) {
        authorRepository.update("UPDATE Author SET first_name = ?1, last_name = ?2 WHERE id = ?3",
                author.getFirstName(),
                author.getLastName(),
                id);
    }

    @Override
    public void create(Author author) {
        authorRepository.persistAndFlush(author);
    }

    @Override
    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}

