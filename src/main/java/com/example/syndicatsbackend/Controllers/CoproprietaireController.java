package com.example.syndicatsbackend.Controllers;


import com.example.syndicatsbackend.entities.Coproprietaire;
import com.example.syndicatsbackend.exceptions.CoproprietaireNotFoundException;
import com.example.syndicatsbackend.services.CoproprietaireService;
import com.example.syndicatsbackend.services.CoproprietaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Coproprietaire")
@CrossOrigin(origins = "http://localhost:4200")
public class CoproprietaireController {


    @Autowired
    private CoproprietaireService coproprietaireService;

 @GetMapping("/getCoproprietaire/{codeCopro}")
    public Coproprietaire getCoproprietaire(@PathVariable("codeCopro") String codeCopro) {
        return coproprietaireService.getCoproprietaire(codeCopro);
    }

    @DeleteMapping("/deleteCoproprietaire/{id}")
    public int deleteCoproprietaire(@PathVariable("id") long id) {
        return coproprietaireService.deleteCoproprietaire(id);
    }
@GetMapping("/ListCoprorietaire")
    public List<Coproprietaire> listCoproprietaires() {

     return coproprietaireService.listCoproprietaires();
    }
@PostMapping("/")
    public int saveCopropriétaire(@RequestBody Coproprietaire coproprietaire) {
        return coproprietaireService.saveCopropriétaire(coproprietaire);
    }
@PutMapping("/")
    public int updateCoproprietaire(@RequestBody Coproprietaire coproprietaire) throws CoproprietaireNotFoundException {

     return coproprietaireService.updateCoproprietaire(coproprietaire);
    }
}
