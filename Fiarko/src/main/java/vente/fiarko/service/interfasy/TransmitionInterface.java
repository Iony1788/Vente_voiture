package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Transmition;

import java.util.List;

public interface TransmitionInterface {
    Transmition cree(Transmition transmition);
    List<Transmition> list();
}
