package com.book.notes.telegram.bot.application.service;

import com.book.notes.telegram.bot.application.port.in.command.CreateAuthorCommand;
import com.book.notes.telegram.bot.application.port.out.command.UpdateAuthorStateCommand;
import com.book.notes.telegram.bot.common.annotation.UseCase;
import com.book.notes.telegram.bot.domain.Author;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
class CreateAuthorUseCase implements CreateAuthorCommand {

//    private final UpdateAuthorStateCommand updateAuthorState;

    @Override
    public Boolean execute(CreateAuthor model) {
        var author = Author.withoutId(model.getFirstName(), model.getLastName(), model.getLanguage());
        return null;
//        return updateAuthorState.update(author).author() != null;
    }
}
