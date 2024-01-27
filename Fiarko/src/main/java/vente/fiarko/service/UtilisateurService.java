package vente.fiarko.service;

import org.springframework.stereotype.Service;
import vente.fiarko.entity.Utilisateur;
import vente.fiarko.repository.UtilisateurRepositorie;

import java.util.List;

@Service
public class UtilisateurService {

    private UtilisateurRepositorie utilisateurRepositorie;

    public List<Utilisateur> getAllUsers(){
        return utilisateurRepositorie.findAll();
    }

    public Utilisateur getUserById(Long idUtilisateur){
        return utilisateurRepositorie.findById(idUtilisateur).orElse(null);
    }

    public boolean isValidLogin(String nom, String password) {
        Utilisateur utilisateur = utilisateurRepositorie.findByNom(nom);

        return utilisateur != null && utilisateur.getPassword().equals(password);
    }
}
