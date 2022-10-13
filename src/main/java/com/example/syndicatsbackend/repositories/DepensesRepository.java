package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Depenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepensesRepository extends JpaRepository<Depenses, Long> {
    Depenses findByCodedep(String codedep);


}
