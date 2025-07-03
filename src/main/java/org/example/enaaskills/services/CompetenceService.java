package org.example.enaaskills.services;

import org.example.enaaskills.modeles.Competence;
import org.example.enaaskills.modeles.SousCompetence;
import org.example.enaaskills.modeles.StatutValidation;
import org.example.enaaskills.repositorys.CompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenceService {

    @Autowired
    private CompetenceRepository competenceRepository;
    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    // ajouter une competence

    public Competence ajouterCompetence(Competence competence) {
        return competenceRepository.save(competence);
    }

    // modifier les competence
    public Competence updateCompetence(Competence competence) {
        return competenceRepository.save(competence);
    }


}
