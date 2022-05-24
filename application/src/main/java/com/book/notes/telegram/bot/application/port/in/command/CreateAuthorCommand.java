package com.book.notes.telegram.bot.application.port.in.command;

import com.book.notes.telegram.bot.common.utils.Language;
import com.book.notes.telegram.bot.common.validation.SelfValidating;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public interface CreateAuthorCommand extends Command<CreateAuthorCommand.CreateAuthorCommandModel, Boolean> {

    @Getter
    class CreateAuthorCommandModel extends SelfValidating<CreateAuthorCommandModel> {

        @NotBlank
        private final String firstName;

        private final String lastName;

        @NotNull
        private final Language language;

        public CreateAuthorCommandModel(String firstName, String lastName, Language language) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.language = language;

            super.validateSelf();
        }
    }
}
