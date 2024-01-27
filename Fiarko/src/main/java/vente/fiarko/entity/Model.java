package vente.fiarko.entity;

import jakarta.persistence.*;

@Entity
@Table(name="modele")
public class Model {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idmodele")
    private Long idmodele;
    @Column(name="modele")
    private String nom;

    public Long getIdmodele() {
        return idmodele;
    }

    public void setIdmodele(Long idmodele) {
        this.idmodele = idmodele;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }








}

