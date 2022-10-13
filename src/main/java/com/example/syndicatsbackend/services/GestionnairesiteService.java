package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.entities.Gestionnairesite;
import com.example.syndicatsbackend.exceptions.GestionnairesiteNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GestionnairesiteService {
    Gestionnairesite getGestionnairesite(String code);
    int deleteGestionnairesite(long id);
    List<Gestionnairesite> listGestionnairesite();
    ResponseEntity<String> saveGestionairesite(Gestionnairesite gestionnairesite);
    Gestionnairesite updateGestionnairesite(Gestionnairesite gestionnairesite, long id);
}
