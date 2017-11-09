package org.uab.android.ui.uiformexample.model;

import com.orm.SugarRecord;


/**
 *
 * Contains model object and mapping.
 *
 */
public class Model extends SugarRecord<Model> {


    private Integer idModel;
    private String nomAsig;
    private String credito;
    private String dia;
    private String hora;

    /**
     *
     */
    public Model(){

    }

    public Model(Integer idModel, String nomAsig, String credito, String dia, String hora) {
        this.idModel = idModel;
        this.nomAsig = nomAsig;
        this.credito = credito;
        this.dia = dia;
        this.hora = hora;
    }

    public Integer getIdModel() {
        return idModel;
    }

    public void setIdModel(Integer idModel) {
        this.idModel = idModel;
    }

    public String getNomAsig() {
        return nomAsig;
    }

    public void setNomAsig(String nomAsig) {
        this.nomAsig = nomAsig;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
