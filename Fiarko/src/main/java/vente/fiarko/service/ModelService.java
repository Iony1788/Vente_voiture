package vente.fiarko.service;

import org.springframework.stereotype.Service;
import vente.fiarko.entity.Model;
import vente.fiarko.repository.ModelRepository;
import vente.fiarko.service.interfasy.ModelInterace;

import java.util.List;

@Service
public class ModelService implements ModelInterace {
    private ModelRepository modelRepository;
    @Override
    public Model cree(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public List<Model> list() {
        return modelRepository.findAll();
    }
}
