package com.hugo.da2d1a.ejercicio04;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProcesoB4 implements CommandLineRunner {
    private final MessageService messageService;
    private final Faker faker;

    @Autowired
    public ProcesoB4(MessageService messageService, Faker faker) {
        this.messageService = messageService;
        this.faker = faker;

    }
    @Override
    public void run(String... args) throws Exception {
        String frase = "Big Bang Theory (provider BigBangTheory en Faker";
        messageService.showMessage("ProcesoA: " + this.getClass().getSimpleName() +
                " - " + frase);

    }
}


