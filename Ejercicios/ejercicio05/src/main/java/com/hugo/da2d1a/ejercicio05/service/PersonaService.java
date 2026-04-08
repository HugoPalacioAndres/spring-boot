package com.hugo.da2d1a.ejercicio05.service;

import com.hugo.da2d1a.ejercicio05.model.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> find(int count);

    Persona findOne();
}
