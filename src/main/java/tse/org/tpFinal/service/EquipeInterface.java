package tse.org.tpFinal.service;

import tse.org.tpFinal.domain.Equipe;

import java.util.List;

public interface EquipeInterface {


    public List<Equipe> findAllEquipe();

    public Equipe findEquipe(Long id);

    public Equipe createEquipe(Equipe equipe);

    public void deleteEquipe(Long id);

    public Equipe saveEquipe(Equipe foundEquipe);
}
