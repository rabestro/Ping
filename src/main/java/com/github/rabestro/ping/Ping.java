package com.github.rabestro.ping;

import java.time.LocalDateTime;

public class Ping {
    public String getResponse() {
        return LocalDateTime.now().toString();
    }
}
