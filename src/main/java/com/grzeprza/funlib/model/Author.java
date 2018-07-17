package com.grzeprza.funlib.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(exclude = {"books"})
@ToString(exclude = "books")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auth_id")
    private Long id;

    @Column(name = "auth_ref_nr")
    private Long ref_nr;

    @Column(name = "auth_name")
    private String name;

    @Column(name = "auth_surname")
    private String surname;

    @Column(name = "auth_birthdate")
    private LocalDate birthDate;

    @Column(name = "auth_deathdate")
    private LocalDate deathDate;

    @Column(name = "auth_web_uri")
    private String personalWebsiteURI;

    @Lob
    @Column(name = "auth_picture")
    private byte[] picture;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(){
    }

    public Author( String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author( String name,  String surname,  Set<Book> books) {
        this.name = name;
        this.surname = surname;
        this.books = books;
    }
}
