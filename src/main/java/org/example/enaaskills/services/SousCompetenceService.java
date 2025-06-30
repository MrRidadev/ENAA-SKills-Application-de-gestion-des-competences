package org.example.enaaskills.services;

import org.example.enaaskills.modeles.SousCompetence;
import org.example.enaaskills.repositorys.SousCompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SousCompetenceService {

    @Autowired
    private SousCompetenceRepository sousCompetenceRepository;

    public SousCompetenceService(SousCompetenceRepository sousCompetenceRepository) {
        this.sousCompetenceRepository = sousCompetenceRepository;
    }

    // ajouter SousCompetence
    public SousCompetence addSousCompetence(SousCompetence sousCompetence) {
        return sousCompetenceRepository.save(sousCompetence);
    }
}
