package vente.fiarko.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Carburant {

    public Long getIdCarburant() {
        return idCarburant;
    }

    public void setIdCarburant(Long idCarburant) {
        this.idCarburant = idCarburant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idCarburant")
    private Long idCarburant;

    @Column(name="type_carburant")
    private String nom;
}
