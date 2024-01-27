package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.fiarko.entity.Model;
import vente.fiarko.service.interfasy.ModelInterace;

import java.util.List;

@RequestMapping("/api/model")
@RestController
@AllArgsConstructor
public class ModelController {
    private final ModelInterace modelInterace;

    @PostMapping("/create")
    public Model create(@RequestBody Model model){
        return modelInterace.cree(model);
    }

    @PostMapping("/list")
    public List<Model> read(){
        return modelInterace.list();
    }
}
