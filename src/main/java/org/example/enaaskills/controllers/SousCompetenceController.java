package org.example.enaaskills.controllers;


import org.example.enaaskills.modeles.SousCompetence;
import org.example.enaaskills.services.SousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SousCompetence")
public class SousCompetenceController {


    @Autowired
    private SousCompetenceService sousCompetenceService;

    public SousCompetenceController(SousCompetenceService sousCompetenceService) {
        this.sousCompetenceService = sousCompetenceService;
    }

    // ajouter SousCompetence
    @PostMapping("/add-SousCompetence")
    public SousCompetence addSousCompetence(@RequestBody SousCompetence sousCompetence) {
        return sousCompetenceService.addSousCompetence(sousCompetence);
    }
}
