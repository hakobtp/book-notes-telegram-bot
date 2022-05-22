package com.book.notes.telegram.bot.domain;

import com.book.notes.telegram.bot.common.utils.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class Title {

    private TitleId id;

    @NotBlank
    private String text;

    @NotNull
    private Language language;

    public record TitleId(Long title, Long book) {
    }
}
