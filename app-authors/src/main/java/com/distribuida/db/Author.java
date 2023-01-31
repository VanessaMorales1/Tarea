package com.distribuida.db;

import lombok.Data;

import javax.persistence.*;

@Table(name = "authors")
@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;


    @Column(name = "first_name")
    private String firstName;


    @Column(name = "last_name")
    private String lastName;
}
