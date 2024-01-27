package vente.fiarko.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vente.fiarko.dte.JwtUtils;
import vente.fiarko.entity.Utilisateur;
import vente.fiarko.service.UtilisateurService;

@RequestMapping("/api")
@RestController
@AllArgsConstructor
public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    private final JwtUtils jwtUtils;


    @GetMapping("/{id}")
    public ResponseEntity<Utilisateur> getUserById(@PathVariable Long idUtilisateur) {
        Utilisateur utilisateur = utilisateurService.getUserById(idUtilisateur);
        if (utilisateur != null) {
            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Utilisateur utilisateur) throws Exception {
        boolean isValidLogin = utilisateurService.isValidLogin(utilisateur.getNom(), utilisateur.getPassword());
        String jwtToken = null;
        if (isValidLogin) {
            // Si l'authentification réussit, générer le jeton JWT
            try{
                jwtToken = jwtUtils.generateJwt(utilisateur);

            }
            catch(Exception e){
                throw e;
            }

            // Vous pouvez renvoyer le token dans la réponse si nécessaire
            return new ResponseEntity<>("Authentification réussie. Token JWT : " + jwtToken, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Authentification échouée", HttpStatus.UNAUTHORIZED);
        }
    }

}
