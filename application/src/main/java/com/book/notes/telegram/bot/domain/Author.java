package com.book.notes.telegram.bot.domain;

import com.book.notes.telegram.bot.common.utils.Language;

public record Author(AuthorId id, String firstName, String lastName, Language language) {

    public static Author withId(AuthorId id, String firstName, String lastName, Language language) {
        return new Author(id, firstName, lastName, language);
    }

    public static Author withoutId(String firstName, String lastName, Language language) {
        return new Author(null, firstName, lastName, language);
    }

    public record AuthorId(Long author, Long book) {
    }
}
