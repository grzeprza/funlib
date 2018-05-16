package com.grzeprza.funlib.funlib.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@ToString(exclude = {"books"})
@EqualsAndHashCode(exclude = {"books"})
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publ_id")
    private Long id;

    @Column(name = "publ_name")
    private String name;

    @Column(name = "publ_year")
    private LocalDate year;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books = new HashSet<>();

    public Publisher(){}

    public Publisher(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

}
