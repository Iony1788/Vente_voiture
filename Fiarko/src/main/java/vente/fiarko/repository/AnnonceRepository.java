package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Annonce;

@Repository
public interface AnnonceRepository extends JpaRepository<Annonce,Long> {
}
