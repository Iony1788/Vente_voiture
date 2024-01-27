package vente.fiarko.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vente.fiarko.entity.Categorie;
import vente.fiarko.repository.CategorieRepository;
import vente.fiarko.service.interfasy.CategorieInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieService implements CategorieInterface {
    private final CategorieRepository categorieRepository;



    @Override
    public Categorie cree(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie modifier(Long idCategorie, Categorie categorie) {

        return categorieRepository.findById(idCategorie)
                .map(modif->{
                    modif.setNomCategorie(categorie.getNomCategorie());
                    return categorieRepository.save(modif);
                        }).orElseThrow(()->new RuntimeException("categorie non throw"))
                        ;
    }

    @Override
    public String supprimer(Long idCategorie) {
         categorieRepository.deleteById(idCategorie);
        return "categorie supprimer";
    }

    @Override
    public List<Categorie> lire() {
        return categorieRepository.findAll();
    }
}
