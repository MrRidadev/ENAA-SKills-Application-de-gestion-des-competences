package org.example.enaaskills.repositorys;

import org.example.enaaskills.modeles.SousCompetence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SousCompetenceRepository extends JpaRepository<SousCompetence, Long> {

    List<SousCompetence> findCompetenceByCompetenceId(Long competenceId);

    // get sous competence a condection de competence id

    List<SousCompetence> findSousCompetenceByCompetenceId(Long competenceId);

    List<SousCompetence> id(Long id);
}
