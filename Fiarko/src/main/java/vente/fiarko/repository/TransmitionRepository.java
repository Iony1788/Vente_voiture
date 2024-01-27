package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Transmition;

@Repository
public interface TransmitionRepository extends JpaRepository<Transmition,Long> {
}
