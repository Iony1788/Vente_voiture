package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.fiarko.entity.Marque;
import vente.fiarko.service.interfasy.MarqueInterface;

import java.util.List;

@RequestMapping("/api/marque")
@RestController
@AllArgsConstructor
public class MarqueController {
    private final MarqueInterface marqueInterface;

    @PostMapping("/ajouter")
    public Marque create(@RequestBody Marque marque){
        return  marqueInterface.cree(marque);
    }

    @PostMapping("/lire")
    public List<Marque> read(){
        return marqueInterface.lire();
    }
}
