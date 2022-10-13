package com.example.syndicatsbackend.Controllers;

import com.example.syndicatsbackend.entities.Cession;
import com.example.syndicatsbackend.entities.Depenses;
import com.example.syndicatsbackend.exceptions.CessionNotFoundException;
import com.example.syndicatsbackend.exceptions.DepensesNotFoundException;
import com.example.syndicatsbackend.services.DepensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Depenses")
public class DepensesController {
    @Autowired
    private DepensesService depensesService;

    @GetMapping("/getDepenses/{codedep}")
    public Depenses getDepenses(@PathVariable("codedep") String codedep) {
        return depensesService.getDepenses(codedep);
    }

    @DeleteMapping("/deleteDepenses/{id}")
    public int deleteDepense(@PathVariable("codedep") long id) {
        return depensesService.deleteDepense(id);
    }
    @GetMapping("/ListDepenses")
    public List<Depenses> listDepenses() {

        return
                depensesService.listDepenses();
    }
    @PostMapping("/")
    public ResponseEntity<String> saveDepenses(@RequestBody Depenses depenses) {
        return depensesService.saveDepenses(depenses);
    }
    @PutMapping("/cession/{codeCession}")
    public Depenses updateDepense(@RequestBody Depenses depenses,@PathVariable("codedep") Long id)  {

        return depensesService.updateDepenses(depenses,id);
    }
}
