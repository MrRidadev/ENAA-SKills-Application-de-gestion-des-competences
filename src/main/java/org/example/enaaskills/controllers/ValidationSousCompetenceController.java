package org.example.enaaskills.controllers;

import org.example.enaaskills.modeles.ValidationSousCompetence;
import org.example.enaaskills.services.ValidationSousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/validation")
public class ValidationSousCompetenceController {


    @Autowired
    private ValidationSousCompetenceService validationSousCompetenceService;

    public ValidationSousCompetenceController(ValidationSousCompetenceService validationSousCompetenceService) {
        this.validationSousCompetenceService = validationSousCompetenceService;
    }


    @PostMapping("/add-validation")
    public ValidationSousCompetence ajouterValidationSousCompetence(@RequestBody ValidationSousCompetence v) {
        return validationSousCompetenceService.addValidationSousCompetence(v);
    }
}
