package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Voiture;

import java.util.List;

public interface VoitureInterface {

    Voiture cree(Voiture voiture);

    String supprimer(Voiture voiture);

    List<Voiture> list();

    Voiture modifier(Long idFiara,Voiture voiture);
}
