package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vente.fiarko.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {
}
