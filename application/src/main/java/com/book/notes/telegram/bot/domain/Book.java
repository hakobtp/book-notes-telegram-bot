package com.book.notes.telegram.bot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@AllArgsConstructor()
public class Book {

    private BookId id;

    @NotNull
    private Title title;

    private Description description;

    private List<Author> authors;

    public record BookId(Long value) {
    }
}
