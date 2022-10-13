package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Coproprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoproprietaireRepository extends JpaRepository<Coproprietaire, Long> {
    Coproprietaire findByCodeCoproprietaire(String codeCopro);


}
