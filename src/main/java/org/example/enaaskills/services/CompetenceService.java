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

    // Calcul et mise à jour du statutValidation d'une compétence
    public Competence calculerStatutValidation(Long competenceId) {
        Competence competence = competenceRepository.findById(competenceId)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));

        List<SousCompetence> sousCompetences = competence.getSousCompetences();

        boolean allvalide = sousCompetences.stream()
                .allMatch(sc -> sc.getStatutValidation() == StatutValidation.VALIDE);

        boolean anyEnCours = sousCompetences.stream()
                .anyMatch(sc -> sc.getStatutValidation() == StatutValidation.EN_ATTENTE);

        if (allvalide) {
            competence.setStatutValidation(StatutValidation.VALIDE);
        } else if (anyEnCours) {
            competence.setStatutValidation(StatutValidation.EN_ATTENTE);
        } else {
            competence.setStatutValidation(StatutValidation.NON_VALIDE);
        }

        return competenceRepository.save(competence);
    }


}
