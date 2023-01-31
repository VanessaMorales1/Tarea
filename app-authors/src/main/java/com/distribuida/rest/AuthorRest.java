package com.distribuida.rest;

import com.distribuida.db.Author;
import com.distribuida.servicios.AuthorService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorRest {

    @Inject
    AuthorService authorService;

    @GET
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GET
    @Path("/{id}")
    public Author findById(@PathParam("id") Long id) {
        return authorService.findById(id);
    }

    @POST
    public void create(Author author) {
        authorService.create(author);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        authorService.delete(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Long id, Author author) {
        authorService.update(id, author);
    }

}

