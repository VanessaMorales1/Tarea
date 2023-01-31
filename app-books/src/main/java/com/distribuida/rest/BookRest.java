package com.distribuida.rest;

import com.distribuida.db.Books;
import com.distribuida.servicios.BookService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRest {

    @Inject
    private BookService bookService;

    @GET
    public List<Books> findAll() {
        return bookService.findAll();
    }

    @GET
    @Path("/{id}")
    public Books findAll(@PathParam("id") Integer id) {
        return bookService.findById(id);
    }

    @POST
    public String saveBook(Books books) {
        bookService.create(books);
        return books.toString();
    }

    @DELETE
    @Path("/{id}")
    public String deleteBookById(@PathParam("id") Integer id) {
        bookService.deleteByID(id);
        return id.toString();
    }

}
