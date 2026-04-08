package com.hugo.da2d1a.ejercicio06.controller;


import com.hugo.da2d1a.ejercicio05.model.Persona;
import com.hugo.da2d1a.ejercicio05.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonaController {

    private PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public String listar(Model model) {
        List<Persona> personas = personaService.find(10);
        model.addAttribute("personas", personas);
        return "personas";
    }

    @GetMapping("/personas/una")
    public String una(Model model) {
        Persona persona = personaService.findOne();
        model.addAttribute("persona", persona);
        return "persona"; // templates/persona.html
    }
}
