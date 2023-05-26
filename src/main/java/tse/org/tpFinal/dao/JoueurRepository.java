package tse.org.tpFinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tse.org.tpFinal.domain.Joueur;


public interface JoueurRepository extends JpaRepository<Joueur,Long> {

}
