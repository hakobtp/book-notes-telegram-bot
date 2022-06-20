package com.book.notes.telegram.bot.adapter.web.rout;

import com.book.notes.telegram.bot.common.exception.InvalidOperationException;

public class AuthorRout {

    public static final String ROOT = "authors";

    private AuthorRout() {
        throw new InvalidOperationException("util class can't be constraint");
    }
}
