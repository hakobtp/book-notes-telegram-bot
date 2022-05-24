package com.book.notes.telegram.bot.application.port.out.command;

import com.book.notes.telegram.bot.domain.Author;

public interface UpdateAuthorStateCommand {

    Author.AuthorId update(Author author);
}
