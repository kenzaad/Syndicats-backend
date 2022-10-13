package com.example.syndicatsbackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data @Entity
@AllArgsConstructor @NoArgsConstructor
public class Coproprietaire {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long id;
    private String codeCoproprietaire;
    private String nomCopro;
    private String cin;
    private int teleFixe;
    private  int gsm;
    private String email;
    private String login;
    private String mdp;
  @OneToOne(fetch = FetchType.EAGER,mappedBy ="coproprietaire")
@JsonIgnore

  Cession cessions;
  @OneToMany(mappedBy = "coproprietaire")
    List<Releves>releves;
;
}
