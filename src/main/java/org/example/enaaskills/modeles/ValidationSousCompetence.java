package org.example.enaaskills.modeles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;


@Entity
public class ValidationSousCompetence {

    @Id
    @GeneratedValue
    private Long id;

    private StatutValidation valide;



    @ManyToOne
    private SousCompetence sousCompetence;

    private LocalDate dateValidation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatutValidation getValide() {
        return valide;
    }

    public void setValide(StatutValidation valide) {
        this.valide = valide;
    }



    public SousCompetence getSousCompetence() {
        return sousCompetence;
    }

    public void setSousCompetence(SousCompetence sousCompetence) {
        this.sousCompetence = sousCompetence;
    }

    public LocalDate getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(LocalDate dateValidation) {
        this.dateValidation = dateValidation;
    }
}
