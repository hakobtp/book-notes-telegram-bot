package com.book.notes.telegram.bot.configuration;

import com.book.notes.telegram.bot.ApplicationConfiguration;
import com.book.notes.telegram.bot.adapter.web.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebConfiguration.class, ApplicationConfiguration.class})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
