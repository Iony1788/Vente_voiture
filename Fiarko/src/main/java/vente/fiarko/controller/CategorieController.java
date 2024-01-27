package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vente.vente_voiture.entity.Categorie;
import vente.vente_voiture.service.interfacy.CategorieInterface;

@RequestMapping("/api/categorie")
@RestController
@AllArgsConstructor
public class CategorieController {
    private final CategorieInterface categorieInterface;

   @PostMapping("/create")
    public Categorie creer(@RequestBody Categorie categorie){

       return categorieInterface.cree(categorie);
   }
}
