package org.example.enaaskills.services;


import org.example.enaaskills.modeles.Apprenant;
import org.example.enaaskills.repositorys.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprenatService {

    @Autowired
    private final ApprenantRepository apprenantRepository;

    public ApprenatService(ApprenantRepository apprenantRepository) {
        this.apprenantRepository = apprenantRepository;
    }

    // ajouter Apprenat
    public Apprenant addApprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

}
