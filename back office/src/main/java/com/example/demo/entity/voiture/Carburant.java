package com.example.demo.entity.voiture;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "carburant")
public class Carburant {
    public Long getIdCarburant() {
        return idCarburant;
    }

    public void setIdCarburant(Long idCarburant) {
        this.idCarburant = idCarburant;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JsonProperty("idCarburant")
    private Long idCarburant;
    @JsonProperty("typeCarburant")
    private String typeCarburant;

}
