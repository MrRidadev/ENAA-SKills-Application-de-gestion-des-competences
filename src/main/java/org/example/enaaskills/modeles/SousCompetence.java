package org.example.enaaskills.modeles;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class SousCompetence {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;

    @ManyToOne
    private Competence competence;

    @OneToMany(mappedBy = "sousCompetence")
    private List<ValidationSousCompetence> validations;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Competence getCompetence() {
        return competence;
    }

    public void setCompetence(Competence competence) {
        this.competence = competence;
    }

    public List<ValidationSousCompetence> getValidations() {
        return validations;
    }

    public void setValidations(List<ValidationSousCompetence> validations) {
        this.validations = validations;
    }
}
