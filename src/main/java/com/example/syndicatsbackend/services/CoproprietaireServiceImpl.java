package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.repositories.CoproprietaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CoproprietaireServiceImpl implements CoproprietaireService {
    @Autowired
    private CoproprietaireRepository coproprietaireRepository;


    @Override
    public Coproprietaire getCoproprietaire(String codeCopro) {

        return coproprietaireRepository.findByCodeCoproprietaire(codeCopro);
    }



    @Override
    @Transactional
    public int deleteCoproprietaire(long id) {

         coproprietaireRepository.deleteById(id);
         return 1;
    }

    @Override
    public List<Coproprietaire> listCoproprietaires() {
        return coproprietaireRepository.findAll();

    }

    @Override
    public int saveCopropriétaire(Coproprietaire coproprietaire) {
        if ((getCoproprietaire(coproprietaire.getCodeCoproprietaire())) != null) {
            return -1;
                    //ResponseEntity.badRequest().body("copropriétaire existe déjà");
        } else
            coproprietaireRepository.save(coproprietaire);
        return 1;
               // ResponseEntity.status(HttpStatus.OK).body("Coproprietaire enregistré");



    }

    @Override
    public int updateCoproprietaire(Coproprietaire coproprietaire)  {
          coproprietaireRepository.save(coproprietaire);
          return 1;



    }


}
