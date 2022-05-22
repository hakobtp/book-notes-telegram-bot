package com.book.notes.telegram.bot.domain;

import com.book.notes.telegram.bot.common.utils.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class Author {

    private AuthorId id;

    @NotBlank
    private String firstName;
    private String lastName;

    @NotNull
    private Language language;

    public record AuthorId(Long author, Long book) {
    }
}
