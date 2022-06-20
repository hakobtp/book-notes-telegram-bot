package com.book.notes.telegram.bot.application.service;

import com.book.notes.telegram.bot.application.port.in.command.CreateAuthorCommand.CreateAuthor;
import com.book.notes.telegram.bot.application.port.out.command.UpdateAuthorStateCommand;
import com.book.notes.telegram.bot.testdata.AuthorTestData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.book.notes.telegram.bot.testdata.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class CreateAuthorUseCaseTest {

    @Mock
    private UpdateAuthorStateCommand updateAuthorState;

    @InjectMocks
    private CreateAuthorUseCase useCase;

    @Test
    void createAuthorExecuteTest() {
        //GIVEN
        var model = new CreateAuthor(AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME, LANGUAGE_ARM);
        var author = AuthorTestData.defaultAuthor();

        given(updateAuthorState.update(any())).willReturn(author.id());

        //WHEN
        var actual = useCase.execute(model);

        //THEN
        assertTrue(actual);

        then(updateAuthorState).should(times(1)).update(any());
    }
}
