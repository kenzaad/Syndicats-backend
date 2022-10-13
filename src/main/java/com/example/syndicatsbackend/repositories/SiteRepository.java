package com.example.syndicatsbackend.repositories;

import com.example.syndicatsbackend.entities.Cession;
import com.example.syndicatsbackend.entities.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
    Site findByCodesite(String codesite);
}
