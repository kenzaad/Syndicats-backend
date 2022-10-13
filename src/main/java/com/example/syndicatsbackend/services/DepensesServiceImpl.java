package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Depenses;
import com.example.syndicatsbackend.repositories.DepensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepensesServiceImpl implements DepensesService{
    @Autowired
    private DepensesRepository depensesRepository;

    @Override
    public Depenses getDepenses(String codedep) {
        return depensesRepository.findByCodedep(codedep);
    }



    @Override
    public int deleteDepense(Long id) {
         depensesRepository.deleteById(id);
         return 1;
    }

    @Override
    public List<Depenses> listDepenses() {
        return depensesRepository.findAll();
    }

    @Override
    public ResponseEntity<String> saveDepenses(Depenses depenses) {
        if ((getDepenses(depenses.getCodedep())) != null) {
            return ResponseEntity.badRequest()
                    .body("Depense existe déjà");
        } else
           depensesRepository.save(depenses);
        return ResponseEntity.status(HttpStatus.OK)
                .body("Depense enregistrée");

    }

    @Override
    public Depenses updateDepenses(Depenses depenses, Long id){
        depenses.setId(id);
        return depensesRepository.save(depenses);


    }
}