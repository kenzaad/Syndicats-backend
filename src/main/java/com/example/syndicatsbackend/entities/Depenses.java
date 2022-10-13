package com.example.syndicatsbackend.entities;

import com.example.syndicatsbackend.enums.natureDepenses;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Depenses {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String codedep;
    private Date datedepense;
    private Date Dateoperation;
    private int montant;
    private String nomfournisseur;
    @Enumerated(EnumType.STRING)
    private natureDepenses naturedepenses;
    @ManyToOne
    private Site site;
}
