package com.book.notes.telegram.bot.application.port.in.command;

import com.book.notes.telegram.bot.common.validation.SelfValidating;

@FunctionalInterface
public interface Command<T extends SelfValidating<T>, R> {

    R execute(T t);
}