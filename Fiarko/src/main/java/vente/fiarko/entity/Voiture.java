package vente.fiarko.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "voiture")
@AllArgsConstructor
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idFiara")
    private Long idFiara;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "idMarque")
    private Marque marque;

    @ManyToOne
    @JoinColumn(name = "idMoteur")
    private Moteur moteur;

    @ManyToOne
    @JoinColumn(name = "idTrans")
    private Transmition transmition;

    @ManyToOne
    @JoinColumn(name = "idCarburant")
    private Carburant carburant;

    @ManyToOne
    @JoinColumn(name = "idModel")
    private Model model;


    @Column(name="kilometrage")
    private String kilometrage;


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Column(name="prix")
    private float prix;

    public Voiture() {

    }
}
