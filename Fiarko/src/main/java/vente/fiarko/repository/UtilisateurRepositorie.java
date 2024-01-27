package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Utilisateur;

@Repository
public interface UtilisateurRepositorie extends JpaRepository<Utilisateur,Long> {
    Utilisateur findByNom(String nom);
}
