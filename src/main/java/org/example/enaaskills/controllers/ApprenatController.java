package org.example.enaaskills.controllers;


import org.example.enaaskills.modeles.Apprenant;
import org.example.enaaskills.services.ApprenatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apprenant")
public class ApprenatController {

    @Autowired
    private final ApprenatService apprenatService;
    public ApprenatController(ApprenatService apprenatService) {
        this.apprenatService = apprenatService;
    }


    // ajouter Apprentant
    @PostMapping("/add-apprenat")
    public Apprenant ajouterApprenat(@RequestBody Apprenant apprenant) {
        return apprenatService.addApprenant(apprenant);
    }
}

