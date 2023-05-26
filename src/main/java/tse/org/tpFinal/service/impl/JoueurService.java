package tse.org.tpFinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tse.org.tpFinal.dao.JoueurRepository;
import tse.org.tpFinal.domain.Joueur;
import tse.org.tpFinal.service.JoueurInterface;

import java.util.List;

@Service
@Transactional
public class JoueurService implements JoueurInterface {

    @Autowired
    private JoueurRepository joueurRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Joueur> findAllJoueur() {

        return this.joueurRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Joueur findJoueur(Long id) {

        return this.joueurRepository.findById(id).orElse(null);
    }

    @Override
    public Joueur createJoueur(Joueur Joueur) {

        return this.joueurRepository.save(Joueur);
    }

    @Override
    public void deleteJoueur(Long id) {

        this.joueurRepository.deleteById(id);
    }

    @Override
    public Joueur saveJoueur(Joueur foundJoueur) {

        return this.joueurRepository.save(foundJoueur);
    }
}
