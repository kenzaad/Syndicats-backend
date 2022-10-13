package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Cession;
import com.example.syndicatsbackend.exceptions.CessionNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CessionService {
    Cession getCession(String codeCession);
    int saveCession(Cession cession);
    List<Cession>  listCessions();
    int deleteCession(long id);
    int updateCession(Cession cession);


}
