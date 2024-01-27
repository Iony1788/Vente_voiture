package vente.fiarko.service;

import org.springframework.stereotype.Service;
import vente.fiarko.entity.Moteur;
import vente.fiarko.repository.MoteurRepository;
import vente.fiarko.service.interfasy.MoteurInterface;

import java.util.List;

@Service
public class MoteurService implements MoteurInterface {
    private MoteurRepository moteurRepository;

    @Override
    public Moteur cree(Moteur moteur) {
        return moteurRepository.save(moteur);
    }

    @Override
    public Moteur modifier(Long idMoteur, Moteur moteur) {
        return moteurRepository.findById(idMoteur)
                .map(modif->{
                    modif.setEtat(moteur.getEtat());
                    return moteurRepository.save(modif);
                }).orElseThrow(()->new RuntimeException("moteur modifier"))

                ;
    }

    @Override
    public List<Moteur> list() {
        return moteurRepository.findAll();
    }
}
