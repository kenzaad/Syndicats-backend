package com.example.syndicatsbackend.services;

import com.example.syndicatsbackend.entities.Site;
import com.example.syndicatsbackend.exceptions.SiteNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SiteService {
    Site getSite(String Codesite);
    ResponseEntity<String> saveSite(Site site);
    List<Site> listSites();
    int deleteSite(Long id);
    Site updateSite(Site site, long id);
}
