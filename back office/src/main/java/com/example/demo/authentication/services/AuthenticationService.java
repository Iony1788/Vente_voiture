package com.example.demo.authentication.services;

import com.example.demo.authentication.repositories.UtilisateurRepository;
import com.example.demo.authentication.tools.JwtUtil;
import com.example.demo.authentication.tools.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.authentication.auth.AuthenticationRequest;
import com.example.demo.authentication.auth.AuthenticationResponse;
import com.example.demo.authentication.auth.RegisterRequest;
import com.example.demo.authentication.entities.Utilisateur;

@Service
public class AuthenticationService {

  @Autowired
  private UtilisateurRepository utilisateurRepository;

  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  private JwtUtil jwtUtil;

  @Autowired
  private PasswordEncoder passwordEncoder;

  //@Transactional
  public AuthenticationResponse register(RegisterRequest request) {
    var user = new Utilisateur();
    user.setEmail(request.getLogin());
    user.setMdp(passwordEncoder.encode(request.getMotDePasse()));
    user.setNom(request.getNom());
    user.setPrenom(request.getPrenom());
    String role = request.getRole();

    try {
      if(role.compareToIgnoreCase("admin") == 0){
      user.setRole(Role.ROLE_ADMIN);
    }else{
      user.setRole(Role.ROLE_USER);
    }
    } catch (NullPointerException e) {
      user.setRole(Role.ROLE_USER); 
    }

    
    utilisateurRepository.save(user);
    var jwtToken = jwtUtil.generateToken(user);
    System.out.println( "----> VOTRE TOKEN: "+jwtToken);

    String nom = jwtUtil.extractNom(jwtToken);
    String prenom = jwtUtil.extractPrenom(jwtToken);
    int id = jwtUtil.extractID(jwtToken);

    return new AuthenticationResponse(jwtToken,id,nom, prenom);
  }

  //@Transactional
  public AuthenticationResponse authenticate(AuthenticationRequest request) throws Exception{
    System.out.println("----> USER FOUND   "+utilisateurRepository.findByEmail(request.getLogin()));
    System.out.println("----> LOGIN   "+request.getLogin());
    System.out.println("----> PWD GIVEN   "+request.getMotDePasse());
    authenticationManager.authenticate(
      new UsernamePasswordAuthenticationToken(
        request.getLogin(),
        request.getMotDePasse()
      )
    );
    var user = utilisateurRepository.findByEmail(request.getLogin()).orElseThrow(() -> new Exception("Erreur d'authentification"));
    var token = jwtUtil.generateToken(user);
    String nom = jwtUtil.extractNom(token);
    String prenom = jwtUtil.extractPrenom(token);
    int id = jwtUtil.extractID(token);
    System.out.println("------> AUTH SUCCESSFUL");
    return new AuthenticationResponse(token,id,nom, prenom);
  }
}
