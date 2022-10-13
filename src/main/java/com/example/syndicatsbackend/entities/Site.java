package com.example.syndicatsbackend.entities;

import com.example.syndicatsbackend.enums.BatimentsSite;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Site {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String codesite;
    private String Nomsite;
    private String Adressesite;
    private String Ville;
    private String Titrefoncier;
    @Enumerated(EnumType.STRING)
    private BatimentsSite batimentssite;
    @OneToMany(mappedBy = "site")
    List<Gestionnairesite> gestionnairesites;
    @OneToMany(mappedBy = "site")
    List<Depenses>depenses;
    @ManyToOne
    private  Cession cession;
}
