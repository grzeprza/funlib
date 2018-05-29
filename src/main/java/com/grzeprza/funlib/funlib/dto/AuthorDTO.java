package com.grzeprza.funlib.funlib.dto;

import com.grzeprza.funlib.funlib.model.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
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
