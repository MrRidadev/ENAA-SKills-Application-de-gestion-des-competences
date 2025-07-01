package org.example.enaaskills.services;

import org.example.enaaskills.modeles.ValidationSousCompetence;
import org.example.enaaskills.repositorys.ValidationSousCompetenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ValidationSousCompetenceService {


    @Autowired
    private ValidationSousCompetenceRepository validationSousCompetenceRepository;

    public ValidationSousCompetenceService(ValidationSousCompetenceRepository validationSousCompetenceRepository) {
        this.validationSousCompetenceRepository = validationSousCompetenceRepository;
    }

    // validé sous competence
    public ValidationSousCompetence addValidationSousCompetence(ValidationSousCompetence validationSousCompetence) {
        return validationSousCompetenceRepository.save(validationSousCompetence);
    }
}
