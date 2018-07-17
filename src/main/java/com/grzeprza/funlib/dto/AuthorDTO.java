package com.grzeprza.funlib.dto;

import com.grzeprza.funlib.model.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class AuthorDTO {
    private Long id;
    private Long ref_nr;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private String personalWebsiteURI;
    private byte[] picture;
    private Set<Book> books = new HashSet<>();
}
