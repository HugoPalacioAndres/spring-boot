package com.hugo.da2d1a.ejercicio04.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Faker faker() {
        return new Faker();
    }
}
