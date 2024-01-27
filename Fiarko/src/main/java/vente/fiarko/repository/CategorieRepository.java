package vente.fiarko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vente.fiarko.entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
