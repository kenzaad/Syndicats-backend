package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.entities.Depenses;
import com.example.syndicatsbackend.exceptions.DepensesNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepensesService {
    Depenses getDepenses(String codedep);


    int deleteDepense(Long id);

    List<Depenses> listDepenses();

    ResponseEntity<String> saveDepenses(Depenses depenses);

    Depenses updateDepenses(Depenses depenses, Long id);
}
