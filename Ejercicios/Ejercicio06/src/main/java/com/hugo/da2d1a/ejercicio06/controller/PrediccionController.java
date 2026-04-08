package com.hugo.da2d1a.ejercicio06.controller;

import org.springframework.stereotype.Controller;

@Controller
public class PrediccionController {
    private final PrediccionService prediccionService;

    public PrediccionController(PrediccionService prediccionService) {
        this.prediccionService = prediccionService;
    }

    @GetMapping("/prediccion")
    public String prediccion(Model model) {
        model.addAttribute("dias", prediccionService.obtenerPrediccionSemana());
        return "prediccion";  // templates/prediccion.html
    }

}
