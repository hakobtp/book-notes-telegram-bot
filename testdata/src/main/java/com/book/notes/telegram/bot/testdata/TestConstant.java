package com.book.notes.telegram.bot.testdata;

import com.book.notes.telegram.bot.common.utils.Language;

import java.util.UUID;

public interface TestConstant {

    //region common
    Long ID_LONG_VAL = 1L;
    Language LANGUAGE_RU = Language.RU;
    Language LANGUAGE_EN = Language.EN;
    Language LANGUAGE_ARM = Language.ARM;
    UUID API_ID = UUID.randomUUID();
    //endregion common

    //region author
    String AUTHOR_FIRST_NAME = "testAuthorFirstName";
    String AUTHOR_LAST_NAME = "testAuthorLastName";
    //endregion author
}
