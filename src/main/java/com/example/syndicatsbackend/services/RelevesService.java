package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Releves;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RelevesService {
    Releves getReleves(Long id);
    ResponseEntity<String> saveReleves(Releves releves);
    List<Releves> listReleves();
    int deleteReleves(Long id);
    Releves updateReleves(Releves releves, long id);
}
