package vente.fiarko.service.interfasy;

import vente.fiarko.entity.Annonce;

import java.util.List;

public interface AnnonceInterface {
    Annonce cree(Annonce annonce);
    String supprimer(Long idannonce);
    Annonce modifier(Long idannonce,Annonce annonce);
    List<Annonce> list();
}
