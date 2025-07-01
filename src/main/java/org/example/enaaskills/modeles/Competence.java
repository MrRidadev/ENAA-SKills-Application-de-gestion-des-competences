package org.example.enaaskills.modeles;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Competence {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "competence")
    @JsonManagedReference
    private List<SousCompetence> sousCompetences;

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

    public List<SousCompetence> getSousCompetences() {
        return sousCompetences;
    }

    public void setSousCompetences(List<SousCompetence> sousCompetences) {
        this.sousCompetences = sousCompetences;
    }
}
