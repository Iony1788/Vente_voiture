package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Marque;
@Repository
public interface MarqueRepository extends JpaRepository<Marque,Long> {
}
