package com.grzeprza.funlib.funlib.model;

import com.grzeprza.funlib.funlib.enums.BookCategory;
import lombok.*;

import javax.persistence.*;
import java.net.URI;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Data
@Entity
@ToString(exclude = {"authors"})
@EqualsAndHashCode(exclude = {"authors"})
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "book_title")
    private String title;

    @Column(name = "book_short_descr")
    private String shortDescription;

    @Column(name = "book_descr")
    private String description;

    @Column(name = "book_isbn")
    private String isbn;

    @OneToMany(mappedBy = "book")
    @Column(name = "book_comments")
    private List<Commentary> commentaryList;

    @Column(name = "book_year")
    private LocalDate publicationYear;

    @Column(name = "book_category")
    @Enumerated(value = EnumType.STRING)
    private BookCategory category;

    @Column(name = "book_audio_uri")
    private URI audiobookUrl;

    @Column(name = "book_cover")
    @Lob
    private Byte[] cover;

    @Column(name = "book_page_count")
    private Integer pageCount;

    @Column(name = "book_org_lang")
    private Locale originalLanguage;

    @Column(name = "book_language")
    private Locale language;

    @Column(name = "book_audio_lang")
    private Locale audiobookLanguage;

    @ManyToMany
    @JoinTable(name =  "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "book_publ_id", nullable = false)
    private Publisher publisher;

    public Book()
    {}

    public Book(String title, String description, String isbn, Set<Author> authors, Publisher publisher) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
    }
}
