package com.grzeprza.funlib.funlib.dto.converter;

import com.grzeprza.funlib.funlib.dto.AuthorDTO;
import com.grzeprza.funlib.funlib.model.Author;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AuthorToAuthorDTO implements Converter<Author, AuthorDTO> {
    public static Author toAuthor(AuthorDTO authorDTO){
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setRef_nr(authorDTO.getRef_nr());
        author.setDeathDate(authorDTO.getBirthDate());
        author.setName(authorDTO.getName());
        author.setPersonalWebsiteURI(authorDTO.getPersonalWebsiteURI());
        author.setSurname(authorDTO.getSurname());
        author.setPicture(authorDTO.getPicture());
        author.setBirthDate(authorDTO.getBirthDate());
        return author;
    }

    @Synchronized
    @Nullable
    @Override
    public AuthorDTO convert(Author author) {
        if(author == null)  return null;

        final AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId(author.getId());
        authorDTO.setRef_nr(author.getRef_nr());
        authorDTO.setDeathDate(author.getBirthDate());
        authorDTO.setName(author.getName());
        authorDTO.setPersonalWebsiteURI(author.getPersonalWebsiteURI());
        authorDTO.setSurname(author.getSurname());
        authorDTO.setPicture(author.getPicture());
        authorDTO.setBirthDate(author.getBirthDate());

        return authorDTO;
    }
}
