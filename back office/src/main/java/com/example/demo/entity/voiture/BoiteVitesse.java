package com.example.demo.entity.voiture;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "boite")
public class BoiteVitesse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idBoite")
    private Long idBoite;
    @JsonProperty("type")
    private String type;

    public Long getIdBoite() {
        return idBoite;
    }

    public void setIdBoite(Long idBoite) {
        this.idBoite = idBoite;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

}
