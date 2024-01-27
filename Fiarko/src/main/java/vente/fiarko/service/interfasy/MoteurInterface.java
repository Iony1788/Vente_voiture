package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Moteur;

import java.util.List;

public interface MoteurInterface {
    Moteur cree(Moteur moteur);
    Moteur modifier(Long idMoteur,Moteur moteur);
    List<Moteur> list();
}
