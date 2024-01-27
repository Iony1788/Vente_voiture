package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Carburant;

import java.util.List;

public interface CarburantInterface {
    Carburant cree(Carburant carburant);
    List<Carburant> list();
}
