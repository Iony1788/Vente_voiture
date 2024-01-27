package vente.fiarko.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcategorie")
    private int idcategorie;

    @Column(name = "nomcategorie")
    private String nomCategorie;


    @OneToMany(mappedBy = "categorie")
    private List<Marque> marques;

    public int getIdcategorie() {
        return idcategorie;
    }

    public void setIdcategorie(int idcategorie) {
        this.idcategorie = idcategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }


}

