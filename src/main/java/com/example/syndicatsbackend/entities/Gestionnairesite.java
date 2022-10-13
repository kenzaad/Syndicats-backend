package com.example.syndicatsbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Gestionnairesite {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String codeGestionnaire;
    private String nomGestionnaire;
    private String fonction;
    private int telefixe;
    private String gsm;
    private Date datedepart;
    private Date datenomination;
    private String login;
    private String mdp;
    @ManyToOne
    private Site site;
}
