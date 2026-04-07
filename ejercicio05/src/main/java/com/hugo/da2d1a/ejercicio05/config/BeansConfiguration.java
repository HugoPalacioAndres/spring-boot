package com.hugo.da2d1a.ejercicio05.config;


import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;

@Configuration
public class BeansConfiguration {

    @Bean
    Faker faker() {
        return new Faker(new Locale("es", "ES"));
    }
}
