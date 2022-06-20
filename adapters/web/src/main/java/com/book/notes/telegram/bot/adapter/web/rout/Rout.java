package com.book.notes.telegram.bot.adapter.web.rout;

public interface Rout {

    String PREFIX = "/api";

    interface V1 {
        String API_V1 = PREFIX + "/v1";

        interface Author {
            String ROOT = API_V1 + "/authors";
        }
    }
}
