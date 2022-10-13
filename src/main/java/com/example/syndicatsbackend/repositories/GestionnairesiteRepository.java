package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Gestionnairesite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestionnairesiteRepository extends JpaRepository<Gestionnairesite, Long> {
    Gestionnairesite findByCodeGestionnaire(String codeGestionnaire);

}
