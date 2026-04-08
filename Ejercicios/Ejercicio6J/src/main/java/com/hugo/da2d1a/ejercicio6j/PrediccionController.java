package com.hugo.da2d1a.ejercicio6j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {

    @Autowired
    private PrediccionService prediccionService;

    @GetMapping("/prediccion")
    public String prediccion(Model model) {
        model.addAttribute("semana", prediccionService.obtenerSemana());
        return "prediccion";
    }
}

