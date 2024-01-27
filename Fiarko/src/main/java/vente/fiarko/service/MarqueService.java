package vente.fiarko.service;

import vente.vente_voiture.entity.Marque;
import vente.vente_voiture.repesitory.MarqueRepositorie;
import vente.vente_voiture.service.interfacy.MarqueInterface;

import java.util.List;

public class MarqueService implements MarqueInterface {
    private MarqueRepositorie marqueRepositorie;
    @Override
    public Marque cree(Marque marque) {
        return marqueRepositorie.save(marque);
    }

    @Override
    public List<Marque> lire() {
        return marqueRepositorie.findAll();
    }
}
