package com.hugo.da2d1a.ejercicio05.service;

import com.hugo.da2d1a.ejercicio05.model.Persona;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PerosonaServiceImplementacion  implements PersonaService {
    private final Faker faker;
    /*Inyrccion de dependencias por el constructor*/
    public PerosonaServiceImplementacion (Faker faker){
        this.faker= faker;
    }

    @Override
    public List<Persona> find(int count) {
        return IntStream.range(0, count)
                .mapToObj(i -> createRandomPersona())
                .collect(Collectors.toList());
    }

    @Override
    public Persona findOne() {
        return createRandomPersona();
    }

    private Persona createRandomPersona() {
        String nombre = faker.name().firstName();
        String apellidos = faker.name().lastName() + " " + faker.name().lastName();
        String dni = faker.idNumber().valid();

        Timestamp fechaRandom = faker.date().birthday(18, 80);  // tipo correcto

        LocalDate fechaNacimiento = fechaRandom.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        return new Persona(nombre, apellidos, dni, fechaNacimiento);
    }
}
