package com.example.syndicatsbackend.Controllers;

import com.example.syndicatsbackend.entities.Depenses;
import com.example.syndicatsbackend.entities.Gestionnairesite;
import com.example.syndicatsbackend.exceptions.DepensesNotFoundException;
import com.example.syndicatsbackend.exceptions.GestionnairesiteNotFoundException;
import com.example.syndicatsbackend.services.GestionnairesiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Gestionnairesite")
public class GestionnairesiteController {
    @Autowired
    private GestionnairesiteService gestionnairesiteService;

    @GetMapping("/getestionnairesite/{code}")
    public Gestionnairesite getGestionniresite(@PathVariable("code") String code) {
        return gestionnairesiteService.getGestionnairesite(code);
    }

    @DeleteMapping("/deleteGestionnairesite/{id}")
    public int deleteGestionnairesite(@PathVariable("id") long id) {
        return gestionnairesiteService.deleteGestionnairesite(id);
    }
    @GetMapping("/ListGestionairesite")
    public List<Gestionnairesite> listGestionnairesite() {

        return
                gestionnairesiteService.listGestionnairesite();
    }
    @PostMapping("/")
    public ResponseEntity<String> saveGestionnairesite(@RequestBody Gestionnairesite gestionnairesite) {
        return gestionnairesiteService.saveGestionairesite(gestionnairesite);
    }
    @PutMapping("/Gestionnairesite/{id}")
    public Gestionnairesite updategstionnaire(@RequestBody Gestionnairesite gestionnairesite,@PathVariable("id") long id)  {

        return gestionnairesiteService.updateGestionnairesite(gestionnairesite,id);
    }
}
