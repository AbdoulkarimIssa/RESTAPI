package tse.org.tpFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tse.org.tpFinal.domain.Equipe;
import tse.org.tpFinal.domain.Joueur;
import tse.org.tpFinal.service.EquipeInterface;
import tse.org.tpFinal.service.JoueurInterface;


import java.util.List;

@RestController
public class sportController {

   @Autowired  //lorsque j'ajoute ça, le programme echoue. je ne sais pas pourquoi avoir avec le prof.
    private JoueurInterface joueurInterface;
    @Autowired
    private EquipeInterface equipeInterface;



    @GetMapping("/equipe")
    public List<Equipe> AllEquipe() {
        return this.equipeInterface.findAllEquipe();
    }

    @GetMapping("/equipe/{id}")
    public Equipe findEquipe(@PathVariable Long id){
        return this.equipeInterface.findEquipe(id);
    }

    @PostMapping("/equipe")
    public Equipe createEquipe(@RequestBody Equipe equipe){
        return this.equipeInterface.createEquipe(equipe);
    }

    @DeleteMapping("/equipe/{id}")
    public void deleteEquipe(@PathVariable Long id){
        this.equipeInterface.deleteEquipe(id);
    }

    // Cette partie est pour les joueurs

    @GetMapping("/joueur")
    public List<Joueur> AllJoueur() {
        return this.joueurInterface.findAllJoueur();
    }
    @GetMapping("/joueur/{id}")
    public Joueur findJoueur(@PathVariable Long id){
        return this.joueurInterface.findJoueur(id);
    }

    @PostMapping("/joueur")
    public Joueur createJoueur(@RequestBody Joueur joueur){
        return this.joueurInterface.createJoueur(joueur);
    }

    @DeleteMapping("/joueur/{id}")
    public void deleteJoueur(@PathVariable Long id){
        this.joueurInterface.deleteJoueur(id);
    }


}
