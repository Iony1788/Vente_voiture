package vente.fiarko.entity;

import jakarta.persistence.*;

@Entity
@Table(name="transmission")
public class Transmition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idTrans")
    private Long idTrans;

    @Column(name="Boite_vitesse")
    private String boite_vitesse;

    
}
