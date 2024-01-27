package vente.fiarko.service.interfasy;


import vente.fiarko.entity.Marque;

import java.util.List;

public interface MarqueInterface {
    Marque cree(Marque marque);
    List<Marque> lire();
}
