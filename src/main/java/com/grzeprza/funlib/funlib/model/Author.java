package com.grzeprza.funlib.funlib.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
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

    @Column(name = "auth_name")
    private String name;

    @Column(name = "auth_surname")
    private String surname;

    @Column(name = "auth_birthdate")
    private LocalDateTime birthDate;

    @Column(name = "auth_deathdate")
    private LocalDateTime deathDate;

    @Column(name = "auth_web_uri")
    private URI personalWebsiteURI;

    @Lob
    @Column(name = "auth_picture")
    private Byte[] picture;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Author(){}

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
