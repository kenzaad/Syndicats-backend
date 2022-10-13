package com.example.syndicatsbackend.entities;

import com.example.syndicatsbackend.enums.modeReglement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity

public class Releves {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long numeroReleve;
    private String codeSite;
    private long codeCopro;
    private Date dateOperation;
    private String libelle;
    private int montantDebit;
    private int montantCredit;
    private Date dateEncaisement;
    private String typeReglement;
    @Enumerated(EnumType.STRING)
    private modeReglement modeReglement;
    @ManyToOne
    private Coproprietaire coproprietaire;
}
