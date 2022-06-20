package com.book.notes.telegram.bot.adapter.web.command;

import com.book.notes.telegram.bot.adapter.web.rout.Rout;
import com.book.notes.telegram.bot.application.port.in.command.CreateAuthorCommand;
import com.book.notes.telegram.bot.application.port.in.command.CreateAuthorCommand.CreateAuthor;
import com.book.notes.telegram.bot.common.utils.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(Rout.V1.Author.ROOT)
public class CreateAuthorCommandController {

    private final CreateAuthorCommand createAuthorCommand;

    @PostMapping
    public ResponseEntity<Void> createAuthor(@RequestBody CreateAuthorRequest request) {
        var createAuthor = new CreateAuthor(request.firstName, request.lastName, request.language);
        createAuthorCommand.execute(createAuthor);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    private record CreateAuthorRequest(String firstName, String lastName, Language language) {
    }
}
