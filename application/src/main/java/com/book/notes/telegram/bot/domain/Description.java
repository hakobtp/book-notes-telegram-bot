package com.book.notes.telegram.bot.domain;

import com.book.notes.telegram.bot.common.utils.Language;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class Description {

    private DescriptionId id;

    @NotBlank
    @Size(max = 1024)
    private String text;

    @NotNull
    private Language language;

    public record DescriptionId(Long description, Long book) {
    }
}
