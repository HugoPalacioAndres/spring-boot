package com.hugo.da2d1a.ejercicio02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC2 implements CommandLineRunner {
    private final MessageService messageService;

    @Autowired
    public ProcesoC2(MessageService messageService){
        this.messageService = messageService;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejecutado por: " + this.getClass().getName());
    }
}


