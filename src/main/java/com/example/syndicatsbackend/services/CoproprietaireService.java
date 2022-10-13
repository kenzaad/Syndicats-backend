package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Cession;
import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.entities.Gestionnairesite;
import com.example.syndicatsbackend.entities.Site;
import com.example.syndicatsbackend.exceptions.CessionNotFoundException;
import com.example.syndicatsbackend.exceptions.CoproprietaireNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CoproprietaireService {
    Coproprietaire getCoproprietaire(String codeCopro);
    int deleteCoproprietaire(long id);
    List<Coproprietaire> listCoproprietaires();
    int saveCopropriétaire(Coproprietaire coproprietaire);
   int  updateCoproprietaire(Coproprietaire coproprietaire);



}
