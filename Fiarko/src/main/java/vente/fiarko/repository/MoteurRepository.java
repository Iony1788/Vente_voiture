package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Moteur;

@Repository
public interface MoteurRepository extends JpaRepository<Moteur,Long> {
}
