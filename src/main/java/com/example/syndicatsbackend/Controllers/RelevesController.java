package com.example.syndicatsbackend.Controllers;

import com.example.syndicatsbackend.entities.Releves;
import com.example.syndicatsbackend.entities.Site;
import com.example.syndicatsbackend.services.RelevesService;
import com.example.syndicatsbackend.services.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Releves")
public class RelevesController {


    @Autowired
    private RelevesService relevesService;

    @GetMapping("/getReleves/{id}")
    public Releves getReleves(@PathVariable("id") Long id) {
        return relevesService.getReleves(id);
    }

    @PostMapping("/")
    public ResponseEntity<String> saveReleves(@RequestBody Releves releves) {
        return relevesService.saveReleves(releves);
    }

    @GetMapping("/ListReleves")
    public List<Releves> listReleves() {
        return relevesService.listReleves();
    }

    @DeleteMapping("/deleteReleves/{id}")
    public int deleteReleves(@PathVariable("id") Long id) {
        return relevesService.deleteReleves(id);
    }

    @PutMapping("/Releves/{id}")
    public Releves updateReleves(@RequestBody Releves releves, @PathVariable("id") long id) {
        return relevesService.updateReleves(releves, id);
    }
}
