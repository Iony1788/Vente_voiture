package vente.fiarko.service;

import org.springframework.stereotype.Service;
import vente.fiarko.entity.Carburant;
import vente.fiarko.service.interfasy.CarburantInterface;

import java.util.List;

@Service
public class CarburantService implements CarburantInterface {
    @Override
    public Carburant cree(Carburant carburant) {
        return null;
    }

    @Override
    public List<Carburant> list() {
        return null;
    }
}
