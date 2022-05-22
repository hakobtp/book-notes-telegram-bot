package com.book.notes.telegram.bot.common.wrapper;

import java.util.Collections;
import java.util.List;

public record PageableWrapper<T>(int page, int size, int totalPages, long totalItems, List<? extends T> items) {

    public PageableWrapper {
        items = Collections.unmodifiableList(this.items());
    }

    public PageableWrapper() {
        this(0, 0, 0, 0, List.of());
    }
}
