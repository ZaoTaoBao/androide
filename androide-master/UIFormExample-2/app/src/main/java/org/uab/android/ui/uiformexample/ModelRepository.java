package org.uab.android.ui.uiformexample;

import java.util.List;

/**
 * Created by zaotaobao on 11/11/17.
 */

public interface ModelRepository {

    List<Model> findAll();

    List<Model> findById(String idModel);

    void update(Model model);

    void save(Model model);



}
