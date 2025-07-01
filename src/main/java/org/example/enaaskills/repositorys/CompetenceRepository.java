package org.example.enaaskills.repositorys;

import org.example.enaaskills.modeles.Competence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompetenceRepository extends JpaRepository<Competence, Long> {

    //List<Competence> findCompetenceBy

}
