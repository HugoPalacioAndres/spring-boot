package com.hugo.da2d1a.ejercicio03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ProcesoC3 implements CommandLineRunner {
    private final MessageService messageService;

    @Autowired
    public ProcesoC3(@Qualifier("systemErrMessageService") MessageService messageService){
        this.messageService = messageService;
    }
    @Override
    public void run(String... args) throws Exception {
        messageService.showMessage("Ejecutado por: " + this.getClass().getName());
    }
}


