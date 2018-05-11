package com.grzeprza.funlib.funlib.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@ToString
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String ISBN;

    @ManyToMany
    @JoinTable(name =  "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    private Publisher publisher;

    public Book()
    {}

    public Book( String title, String description,  String ISBN,  Set<Author> authors, Publisher publisher) {
        this.title = title;
        this.description = description;
        this.ISBN = ISBN;
        this.authors = authors;
        this.publisher = publisher;
    }


}
