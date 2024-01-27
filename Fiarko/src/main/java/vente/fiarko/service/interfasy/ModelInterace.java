package vente.fiarko.service.interfasy;


import vente.fiarko.entity.Model;

import java.util.List;

public interface ModelInterace {
    Model cree(Model model);
    List<Model> list();
}
