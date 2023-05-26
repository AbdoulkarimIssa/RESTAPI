package tse.org.tpFinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tse.org.tpFinal.dao.EquipeRepository;
import tse.org.tpFinal.domain.Equipe;
import tse.org.tpFinal.service.EquipeInterface;

import java.util.List;

@Service
@Transactional
public class EquipeService implements EquipeInterface {

    @Autowired
    private EquipeRepository   equipeRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Equipe> findAllEquipe() {

        return this.equipeRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Equipe findEquipe(Long id) {

        return this.equipeRepository.findById(id).orElse(null);
    }

    @Override
    public Equipe createEquipe(Equipe equipe) {

        return this.equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(Long id) {

        this.equipeRepository.deleteById(id);
    }

    @Override
    public Equipe saveEquipe(Equipe foundEquipe) {

        return this.equipeRepository.save(foundEquipe);
    }

}
