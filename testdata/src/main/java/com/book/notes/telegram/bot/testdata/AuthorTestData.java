package com.book.notes.telegram.bot.testdata;

import com.book.notes.telegram.bot.common.utils.Language;
import com.book.notes.telegram.bot.domain.Author;

import static com.book.notes.telegram.bot.testdata.TestConstant.*;

public class AuthorTestData {

    public static Author defaultAuthor() {
        return builder()
                .id(new Author.AuthorId(ID_LONG_VAL, ID_LONG_VAL))
                .firstName(AUTHOR_FIRST_NAME)
                .lastName(AUTHOR_LAST_NAME)
                .language(LANGUAGE_ARM)
                .build();
    }

    public static AuthorBuilder builder() {
        return new AuthorBuilder();
    }

    public static class AuthorBuilder {
        private Author.AuthorId id;
        private String firstName;
        private String lastName;
        private Language language;

        public AuthorBuilder id(Author.AuthorId id) {
            this.id = id;
            return this;
        }

        public AuthorBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public AuthorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public AuthorBuilder language(Language language) {
            this.language = language;
            return this;
        }

        public Author build() {
            return Author.withId(id, firstName, lastName, language);
        }
    }
}
