package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Releves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelevesRepository extends JpaRepository<Releves,Long> {
   Releves findByNumeroReleve(long numeroReleve);
}
