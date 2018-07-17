package com.grzeprza.funlib.dto.converter;

import com.grzeprza.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.model.Author;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AuthorDTOToAuthor implements Converter<AuthorDTO, Author> {

    @Synchronized
    @Nullable
    @Override
    public Author convert(AuthorDTO authorDTO) {
        if (authorDTO == null) return null;

        final Author author = new Author();

        author.setBirthDate(authorDTO.getBirthDate());
        author.setPicture(authorDTO.getPicture());
        author.setBooks(authorDTO.getBooks());
        author.setId(authorDTO.getId());
        author.setRef_nr(authorDTO.getRef_nr());
        author.setDeathDate(authorDTO.getDeathDate());
        author.setName(authorDTO.getName());
        author.setPersonalWebsiteURI(authorDTO.getPersonalWebsiteURI());
        author.setSurname(authorDTO.getSurname());

        return author;
    }
}
