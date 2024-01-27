package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.fiarko.entity.Carburant;
import vente.fiarko.service.interfasy.CarburantInterface;

import java.util.List;

@RestController
@RequestMapping("/api/carburant")
@AllArgsConstructor
public class CarburantController {
    private final CarburantInterface carburantInterface;

    @PostMapping("/ajouter")

    public Carburant create(Carburant carburant){
        return carburantInterface.cree(carburant);
    }
    @PostMapping("/lire")
    public List<Carburant> read(){
        return carburantInterface.list();
    }

}
