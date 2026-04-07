package com.hugo.da2d1a.ejercicio03;

import org.springframework.stereotype.Component;

@Component
public class SystemErrMessageService implements MessageService {
    @Override
    public void showMessage(String message) {
        System.err.println("\uD83D\uDD34 [ERR]: "+ message);
    }
}
