package vente.fiarko.entity;

import jakarta.persistence.*;

@Entity
@Table(name="moteur")
public class Moteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idMoteur")
    private Long idMoteur;

    @Column(name="cheveaux")
    private int chevaux;

    public Long getEtat() {
        return etat;
    }

    public void setEtat(Long etat) {
        this.etat = etat;
    }

    @Column(name="etat")
    private Long etat;
}
