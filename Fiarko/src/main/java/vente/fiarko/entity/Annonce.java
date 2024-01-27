package vente.fiarko.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "annonce")
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idannonce")
    private Long idannonce;

    @Column(name="description")
    private String description;


    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    @ManyToOne
    @JoinColumn(name = "idFiara")
    private Voiture voiture;

    @Column(name="isValid")
    private boolean isValid;

    public LocalDateTime getDateAnnonce() {
        return dateAnnonce;
    }

    public void setDateAnnonce(LocalDateTime dateAnnonce) {
        this.dateAnnonce = dateAnnonce;
    }

    @Column(name="Date_Annonce")
    private LocalDateTime dateAnnonce;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    @JsonBackReference
    private Utilisateur utilisateur;


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Long getIdAnnonce() {
        return idannonce;
    }

    public void setIdAnnonce(Long idAnonnce) {
        this.idannonce = idAnonnce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

}
