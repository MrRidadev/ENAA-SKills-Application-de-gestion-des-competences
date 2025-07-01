package org.example.enaaskills.services;

import org.example.enaaskills.modeles.SousCompetence;
import org.example.enaaskills.repositorys.CompetenceRepository;
import org.example.enaaskills.repositorys.SousCompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SousCompetenceService {
    @Autowired
    private CompetenceRepository competenceRepository;
    @Autowired
    private SousCompetenceRepository sousCompetenceRepository;

    public SousCompetenceService(SousCompetenceRepository sousCompetenceRepository) {
        this.sousCompetenceRepository = sousCompetenceRepository;
    }

    // ajouter SousCompetence
    public SousCompetence addSousCompetence(SousCompetence sousCompetence) {
        return sousCompetenceRepository.save(sousCompetence);
    }

    public List<SousCompetence> getAllSousCompetences(long id) {
        if (competenceRepository.existsById(id)) {
            return sousCompetenceRepository.findSousCompetenceByCompetenceId(id);
        } else {
            System.out.println("La compétence avec l'ID " + id + " n'existe pas.");
            // Retourne une liste vide
            return new ArrayList<>();
        }
    }

}
