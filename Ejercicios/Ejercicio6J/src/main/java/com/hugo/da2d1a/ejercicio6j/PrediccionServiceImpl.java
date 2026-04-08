package com.hugo.da2d1a.ejercicio6j;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrediccionServiceImpl implements PrediccionService {

    @Autowired
    private Faker faker;



    @Override
    public List<PrediccionDia> obtenerSemana() {
       List<PrediccionDia> predicciones = new ArrayList<>();
       LocalDate hoy = LocalDate.now();

       for(int i=0;i<7;i++){
           predicciones.add(new PrediccionDia(
                   hoy.plusDays(i),
                   faker.number().numberBetween(0, 101),
                   faker.number().numberBetween(0, 11),
                   faker.number().numberBetween(10, 21),
                   faker.number().numberBetween(0, 6)

           ));
       }return predicciones;
    }
}
