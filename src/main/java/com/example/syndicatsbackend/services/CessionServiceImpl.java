package com.example.syndicatsbackend.services;


import com.example.syndicatsbackend.entities.Cession;
import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.exceptions.CessionNotFoundException;
import com.example.syndicatsbackend.repositories.CessionRepository;
import com.example.syndicatsbackend.repositories.CoproprietaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CessionServiceImpl implements CessionService {

    @Autowired
    private CessionRepository cessionRepository;
    @Autowired
    private CoproprietaireRepository coproprietaireRepository;

    @Override
    public Cession getCession(String codeCession) {

        return cessionRepository.findByCodeCession(codeCession);
    }

    @Override
    public int saveCession(Cession cession) {
        if (getCession(cession.getCodeCession()) != null) {
            return -1;
        } else {
            Coproprietaire coproprietaire=coproprietaireRepository.findByCodeCoproprietaire(cession.getCoproprietaire().getCodeCoproprietaire());
            cession.setCoproprietaire(coproprietaire);
            cessionRepository.save(cession);
            return 1;

        }

    }

    @Override
    public List<Cession> listCessions() {
        return cessionRepository.findAll();
    }

    @Override
    public int deleteCession(long id) {

        cessionRepository.deleteById(id);
        return 1;
    }

    @Override
    public int updateCession(Cession cession) {

        return saveCession(cession);
    }
}
