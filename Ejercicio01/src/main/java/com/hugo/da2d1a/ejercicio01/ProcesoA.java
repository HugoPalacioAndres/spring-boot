package com.hugo.da2d1a.ejercicio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ProcesoA implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Ejecutado por: " + this.getClass().getName());
    }
}
