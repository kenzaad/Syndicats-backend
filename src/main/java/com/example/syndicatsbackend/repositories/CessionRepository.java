package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Cession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CessionRepository extends JpaRepository<Cession, Long> {
    Cession findByCodeCession(String codeCession);
    int deleteByCodeCession(String codeCession);


}
