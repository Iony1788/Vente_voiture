package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Categorie;

import java.util.List;

public interface CategorieInterface {
    Categorie cree(Categorie categorie);
    Categorie modifier( Long idCategorie ,Categorie categorie);
    String supprimer(Long idCategorie);
    List<Categorie> lire();
}
