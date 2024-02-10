package com.example.demo.authentication.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.authentication.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.authentication.entities.Utilisateur;


@Service
public class UtilisateurService {

  @Autowired
  private UtilisateurRepository utilisateurRepository;


  //@Transactional
  public Optional<Utilisateur> findByNameAndPassword(Utilisateur utilisateur) {
    Optional<Utilisateur> user = utilisateurRepository.findByEmailAndMdp(
      utilisateur.getEmail(),
      utilisateur.getMdp()
    );
    if (user.isPresent()) {
      System.out.println(user.get());
    }
    return user;
  }

  //@Transactional
  public List<Utilisateur> getAllUsers(){
    return utilisateurRepository.findAll();
  }

  //@Transactional
  public Utilisateur findById(int iduser){
      return utilisateurRepository.findById(iduser).get();
  }
}
