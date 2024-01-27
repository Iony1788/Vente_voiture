package vente.fiarko.service;

import org.springframework.stereotype.Service;
import vente.fiarko.entity.Voiture;
import vente.fiarko.repository.VoitureRepository;
import vente.fiarko.service.interfasy.VoitureInterface;

import java.util.List;

@Service
public class VoitureService implements VoitureInterface {
    private VoitureRepository voitureRepository;

    @Override
    public Voiture cree(Voiture voiture) {
        return voitureRepository.save(voiture);
    }

    @Override
    public String supprimer(Voiture voiture) {
        return "voiture supprimer";
    }

    @Override
    public List<Voiture> list() {
        return voitureRepository.findAll();
    }

    @Override
    public Voiture modifier(Long idFiara, Voiture voiture) {
        return voitureRepository.findById(idFiara)
                .map(modif->{
                    modif.setPrix(voiture.getPrix());
                    return voitureRepository.save(modif);
                }).orElseThrow(()->new RuntimeException("voiture modifier"))

                ;
    }
}
