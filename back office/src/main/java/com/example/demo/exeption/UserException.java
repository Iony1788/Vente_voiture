package com.example.demo.exeption;

public class UserException extends Exception {
    public final String userNotFound = "aucun d'utilisateur trouver";

    public String getUserNotFound() {
        return userNotFound;
    }

    
}
