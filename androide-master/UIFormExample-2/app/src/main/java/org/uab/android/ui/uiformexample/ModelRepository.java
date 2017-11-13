package org.uab.android.ui.uiformexample;

import java.util.List;

/**
 * Created by zaotaobao on 11/11/17.
 */

public interface ModelRepository {
    /**
     * Devuelve todos los modelos existentes.
     * @return lista de modelos
     */
    List<Model> findAll();

    /**
     * Recuperamos un único model a partir del idModel no utilizamos el id de sugar.
     * @param idModel
     * @return Model
     *
     */
    List<Model> findById(String idModel);

    /**
     * Actualizamos un modelo
     * @param model
     */
    void update(Model model);

    /**
     * Salvamos un modelo.
     *
     * @param model
     */
    void save(Model model);
}
