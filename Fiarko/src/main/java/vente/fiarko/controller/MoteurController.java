package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.fiarko.entity.Moteur;
import vente.fiarko.service.interfasy.MoteurInterface;

import java.util.List;

@RequestMapping("/api/moteur")
@RestController
@AllArgsConstructor
public class MoteurController {
    private final MoteurInterface moteurInterface;

    @PostMapping("/cree")
    public Moteur create(@RequestBody Moteur moteur){
        return moteurInterface.cree(moteur);
    }

    @PostMapping("/read")

    public List<Moteur> read(){
        return moteurInterface.list();
    }
}
