package org.example.enaaskills.controllers;


import org.example.enaaskills.modeles.Competence;
import org.example.enaaskills.services.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/competence")
public class CompetenceController {

    @Autowired
    private final CompetenceService competenceService;
    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    //  ajouter competencce
    @PostMapping("/add-competence")
    public Competence addCompetence(@RequestBody Competence competence) {
        return competenceService.ajouterCompetence(competence);
    }
}
