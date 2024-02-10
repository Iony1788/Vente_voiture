package com.example.demo.entity.voiture;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="moteur")
public class Moteur {
    public Long getIdMoteur() {
        return idMoteur;
    }

    public void setIdMoteur(Long idMoteur) {
        this.idMoteur = idMoteur;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String getNumeroMoteur() {
        return numeroMoteur;
    }

    public void setNumeroMoteur(String numeroMoteur) {
        this.numeroMoteur = numeroMoteur;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idMoteur")
    private Long idMoteur;
    @JsonProperty("puissance")
     private  int puissance;
    @JsonProperty("numeroMoteur")
     private String numeroMoteur;
}
