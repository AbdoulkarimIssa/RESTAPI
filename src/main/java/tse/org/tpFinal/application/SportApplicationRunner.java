package tse.org.tpFinal.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import tse.org.tpFinal.domain.Equipe;
import tse.org.tpFinal.domain.Joueur;
import tse.org.tpFinal.service.EquipeInterface;
import tse.org.tpFinal.service.JoueurInterface;


@Component
@Profile("test")
public class SportApplicationRunner implements ApplicationRunner {
    @Autowired
    private EquipeInterface equipeInterface;

    @Autowired
    private JoueurInterface joueurInterface;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Equipe test = new Equipe();
        test.setNom("Issa");
        this.equipeInterface.saveEquipe(test);

        Joueur MonJoueur = new Joueur();
        MonJoueur.setNom("test 2");
        MonJoueur.setPrenom("test test ");
        MonJoueur.setEquipe(test);

        this.joueurInterface.saveJoueur(MonJoueur);

    }
}
