package com.book.notes.telegram.bot.application.port.in.query;

@FunctionalInterface
public interface Query<R, T> {

    R execute(T t);
}
