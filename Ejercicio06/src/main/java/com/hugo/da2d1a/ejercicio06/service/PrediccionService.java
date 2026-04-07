package com.hugo.da2d1a.ejercicio06.service;

import com.hugo.da2d1a.ejercicio06.controller.PrediccionController;
import com.hugo.da2d1a.ejercicio06.model.PrediccionDia;

import java.util.List;

public interface PrediccionService {
    List<PrediccionDia> obtenerPerediccionSemana();
}
