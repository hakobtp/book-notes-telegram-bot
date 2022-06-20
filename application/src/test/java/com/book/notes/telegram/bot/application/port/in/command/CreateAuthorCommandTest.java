package com.book.notes.telegram.bot.application.port.in.command;

import com.book.notes.telegram.bot.application.port.in.command.CreateAuthorCommand.CreateAuthor;
import com.book.notes.telegram.bot.common.utils.Language;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.validation.ConstraintViolationException;
import java.util.stream.Stream;

import static com.book.notes.telegram.bot.testdata.TestConstant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CreateAuthorCommandTest {

    @MethodSource
    @DisplayName("Should create CreateAuthor object")
    @ParameterizedTest(name = "When fields are {argumentsWithNames}.")
    void createAuthorCommandModel_successCaseTest(String firstName, String lastName, Language language) {
        //GIVEN
        var model = new CreateAuthor(firstName, lastName, language);

        //THEN
        assertEquals(model.getLanguage(), language);
        assertEquals(model.getLastName(), lastName);
        assertEquals(model.getFirstName(), firstName);
    }

    private static Stream<Arguments> createAuthorCommandModel_successCaseTest() {
        return Stream.of(
                Arguments.of(AUTHOR_FIRST_NAME, null, LANGUAGE_ARM),
                Arguments.of(AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME, LANGUAGE_ARM)
        );
    }

    @MethodSource
    @DisplayName("Should throw if firstName or language is null")
    @ParameterizedTest(name = "When fields are {argumentsWithNames}.")
    void createAuthorCommandModel_validationTest(String firstName, String lastName, Language language) {
        var ex = assertThrows(ConstraintViolationException.class,
                () -> new CreateAuthor(firstName, lastName, language));
    }

    private static Stream<Arguments> createAuthorCommandModel_validationTest() {
        return Stream.of(
                Arguments.of(null, AUTHOR_LAST_NAME, null),
                Arguments.of(null, AUTHOR_LAST_NAME, LANGUAGE_ARM),
                Arguments.of(AUTHOR_FIRST_NAME, AUTHOR_LAST_NAME, null)
        );
    }
}
