package com.example.syndicatsbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Responsablepromoteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String codeRespo;
    private String codesite;
    private String nomresponsable;
    private String fonction;
    private int telfixe;
    private int gsm;
    private String email;
}
