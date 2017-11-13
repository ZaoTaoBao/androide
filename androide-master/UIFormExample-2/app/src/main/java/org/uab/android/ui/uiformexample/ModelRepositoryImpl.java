package org.uab.android.ui.uiformexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zaotaobao on 11/11/17.
 */
public class ModelRepositoryImpl implements  ModelRepository{

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Model> findAll() {
        return Model.listAll(Model.class);
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Model> findById(String idModel) {
        return Model.find(Model.class, "idModel = ?", idModel);
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void update(Model model) {
        if(model == null) throw new IllegalArgumentException("El model actualizar no puede ser nulo");

        Model old = Model.findById(Model.class, model.getId());

        old.setCreditos(model.getCreditos());
        old.setDia(model.getDia());
        old.setHora(model.getHora());
        old.setNombreAsig(model.getNombreAsig());
        old.setIdModel(String.valueOf(old.getId()));//metemos el mismo id por metert algo
        model.save();
    }
    /**
     *
     * {@inheritDoc}
     */
    @Override
    public void save(Model model) {
        if(model == null) throw new IllegalArgumentException("El model a insertar no puede ser nulo");
        model.save();
    }
}
