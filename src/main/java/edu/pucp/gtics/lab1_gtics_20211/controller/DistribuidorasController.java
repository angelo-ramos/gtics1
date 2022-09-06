package edu.pucp.gtics.lab1_gtics_20211.controller;

import edu.pucp.gtics.lab1_gtics_20211.entity.Distribuidoras;
import edu.pucp.gtics.lab1_gtics_20211.repository.DistribuidorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/distribuidoras")
public class DistribuidorasController {

    @Autowired   //Gestiona la instancia del repositorio
    DistribuidorasRepository distribuidorasRepository;

    @GetMapping("/lista")
    public String listaDistribuidoras(Model model){
        List<Distribuidoras> distribuidoraList = distribuidorasRepository.findAll();
        model.addAttribute("distribuidoraList",distribuidoraList);
        return "distribuidoras/lista";
    }

    @GetMapping("/editar")
    public String editarDistribuidoras(@RequestParam("id") int id, Model model){
        Optional<Distribuidoras> distbOpt = distribuidorasRepository.findById(id);
        if (distbOpt.isPresent()) {
            Distribuidoras distribuidora = distbOpt.get();  //Obteniendo objeto distribuid que esta dentro del optional
            model.addAttribute("distribuidora", distribuidora);
            return "distribuidoras/editar";
        } else {
            return "redirect:/distribuidoras/lista";
        }
    }

    @GetMapping("/nuevo")
    public String nuevaDistribuidora(){
        return "distribuidoras/nuevo";
    }

    @PostMapping("/guardar")
    public String guardarDistribuidora(Distribuidoras distribuidora){
        distribuidorasRepository.save(distribuidora);
        return "redirect:/distribuidoras/lista";
    }

    @GetMapping("/borrar")
    public String borrarDistribuidora(@RequestParam("id") String idStr){

        try {
            int id = Integer.parseInt(idStr);
            Optional<Distribuidoras> opt = distribuidorasRepository.findById(id);
            if (opt.isPresent()) {
                distribuidorasRepository.deleteById(opt.get().getIddistribuidora());
            }
            System.out.println("borrado correctamente");
        } catch (NumberFormatException e) {
            System.out.println("error en id");
        }
        return "redirect:/distribuidoras/lista";
    }

}
