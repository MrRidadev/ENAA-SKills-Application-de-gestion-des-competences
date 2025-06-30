package org.example.enaaskills.modeles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;


@Entity
public class Apprenant {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;
    private String email;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ValidationSousCompetence> getValidations() {
        return validations;
    }

    public void setValidations(List<ValidationSousCompetence> validations) {
        this.validations = validations;
    }

    @OneToMany(mappedBy = "apprenant")
    private List<ValidationSousCompetence> validations;
}
