package tse.org.tpFinal.service;

import tse.org.tpFinal.domain.Joueur;

import java.util.List;

public interface JoueurInterface {
    public List<Joueur> findAllJoueur();

    public Joueur findJoueur(Long id);

    public Joueur createJoueur(Joueur Joueur);

    public void deleteJoueur(Long id);

    public Joueur saveJoueur(Joueur foundJoueur);
}
