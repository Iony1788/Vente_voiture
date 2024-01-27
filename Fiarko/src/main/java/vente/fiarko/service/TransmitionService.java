package vente.fiarko.service;

import vente.fiarko.entity.Transmition;
import vente.fiarko.repository.TransmitionRepository;
import vente.fiarko.service.interfasy.TransmitionInterface;

import java.util.List;

public class TransmitionService implements TransmitionInterface {
    private TransmitionRepository transmitionRepository;
    @Override
    public Transmition cree(Transmition transmition) {
        return transmitionRepository.save(transmition);
    }

    @Override
    public List<Transmition> list() {
        return transmitionRepository.findAll();
    }
}
