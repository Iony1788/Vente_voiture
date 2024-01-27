package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.fiarko.entity.Transmition;
import vente.fiarko.service.interfasy.TransmitionInterface;

import java.util.List;

@RestController
@RequestMapping("/api/transmition")
@AllArgsConstructor
public class TransmissionController {
    private final TransmitionInterface transmitionInterface;

    @PostMapping("/create")
    public Transmition create(@RequestBody Transmition transmition){
        return transmitionInterface.cree(transmition);
    }

    @PostMapping("/lire")
    public List<Transmition> read(){
        return transmitionInterface.list();
    }
}
