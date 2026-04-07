package com.hugo.da2d1a.ejercicio04;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC4 implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    @Autowired
    public ProcesoC4(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;

    }
    @Override
    public void run(String... args) throws Exception {
        String frase = "Juego de Tronos (provider GameOfThrones en Faker";
        messageService.showMessage("ProcesoA: " + this.getClass().getSimpleName() +
                " - " + frase);

    }
}


