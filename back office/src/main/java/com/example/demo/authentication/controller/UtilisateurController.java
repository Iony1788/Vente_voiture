package com.example.demo.authentication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.authentication.auth.AuthenticationRequest;
import com.example.demo.authentication.auth.RegisterRequest;
import com.example.demo.authentication.services.AuthenticationService;
import com.example.demo.response.Response;

@RestController
@RequestMapping("/login")
public class UtilisateurController {

  @Autowired
  private AuthenticationService service;

  @PostMapping("/register")
  public Response register(@RequestBody RegisterRequest request) {
    System.out.println(1);
    try {
      service.register(request);
      return new Response("200", false, null);
    } catch (Exception e) {
      e.printStackTrace();
      return new Response("400", true, null);

    }
  }

  @PostMapping("/auth")
  public ResponseEntity<?> auth(@RequestBody AuthenticationRequest request) {
    Response res = null; 
    try {
      res = new Response("200", false, service.authenticate(request));
      return new ResponseEntity<Response>(res, HttpStatus.OK);
    } catch (Exception e) {
      System.out.println("-------> AUTH ERROR");
      res = new Response("Errreur d'authentification", true, null);
      return new ResponseEntity<Response>(res, HttpStatus.UNAUTHORIZED);
    }
    
  
  }
}
