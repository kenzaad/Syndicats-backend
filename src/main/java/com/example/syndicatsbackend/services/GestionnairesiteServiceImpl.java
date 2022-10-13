package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Gestionnairesite;
import com.example.syndicatsbackend.repositories.GestionnairesiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GestionnairesiteServiceImpl implements GestionnairesiteService {
    @Autowired
    private GestionnairesiteRepository gestionnairesiteRepository;


    @Override
    public Gestionnairesite getGestionnairesite(String code) {
        return gestionnairesiteRepository.findByCodeGestionnaire(code);
    }

    @Override
    public int deleteGestionnairesite(long id) {
         gestionnairesiteRepository.deleteById(id);
         return 1;
    }

    @Override
    public List<Gestionnairesite> listGestionnairesite() {

        return gestionnairesiteRepository.findAll();
    }

    @Override
    public ResponseEntity<String> saveGestionairesite(Gestionnairesite gestionnairesite) {
        if ((getGestionnairesite(gestionnairesite.getCodeGestionnaire())) != null) {
            return ResponseEntity.badRequest()
                    .body("Gestionnaire site existe déjà");
        } else
            gestionnairesiteRepository.save(gestionnairesite);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Gestionnaire site enregistré");


    }

    @Override
    public Gestionnairesite updateGestionnairesite(Gestionnairesite gestionnairesite, long id) {
        gestionnairesite.setId(id);
        return gestionnairesiteRepository.save(gestionnairesite);

    }


}
