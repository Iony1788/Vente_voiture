package vente.fiarko.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity

public class Utilisateur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private int idUtilisateur;

    private String nom;
    private String email;
    private String password;

    @OneToMany(mappedBy = "utilisateur")
    @JsonManagedReference
    private List<Annonce> annonces = new ArrayList<>();

    public int getIdUtilisateur() {
        return idUtilisateur;
    }
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String user) {
        this.nom = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Annonce> getAnnonces() {
        return annonces;
    }
    public void setAnnonces(List<Annonce> annonces) {
        this.annonces = annonces;
    }

}
