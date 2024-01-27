package vente.fiarko.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vente.fiarko.entity.Annonce;
import vente.fiarko.repository.AnnonceRepository;
import vente.fiarko.service.interfasy.AnnonceInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class AnnonceService implements AnnonceInterface {

    private AnnonceRepository annonceRepository;

    @Override
    public Annonce cree(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    @Override
    public String supprimer(Long idannonce) {
        return "supprimer";
    }

    @Override
    public Annonce modifier(Long idannonce, Annonce annonce) {
        return annonceRepository.findById(idannonce)
                .map(modif->{
                    modif.setValid(annonce.isValid());
                    return annonceRepository.save(modif);
                }).orElseThrow(()->new RuntimeException("annonce non throw"))

                ;
        }

    @Override
    public List<Annonce> list() {
        return annonceRepository.findAll();
    }
}
