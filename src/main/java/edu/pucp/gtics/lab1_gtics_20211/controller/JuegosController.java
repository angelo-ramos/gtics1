package edu.pucp.gtics.lab1_gtics_20211.controller;


import edu.pucp.gtics.lab1_gtics_20211.entity.Juegos;
import edu.pucp.gtics.lab1_gtics_20211.repository.JuegosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/juegos")
public class JuegosController {

    @Autowired
    JuegosRepository juegosRepository;

    @GetMapping("/lista")
    public String listaJuegos (Model model){
        List<Juegos> juegosList = juegosRepository.listaAscd();
        model.addAttribute("juegosList",juegosList);
        return "juegos/lista";
    }

    @GetMapping("/editar")
    public String editarJuegos(){
        return "distribuidoras/lista";
    }

    public String guardarJuegos(){
        return "distribuidoras/lista";
    }


}
