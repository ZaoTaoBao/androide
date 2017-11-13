package org.uab.android.ui.uiformexample;

import com.orm.SugarRecord;

/**
 * Created by zaotaobao on 11/11/17.
 */
public class Model extends SugarRecord<Model> {

    //el idmodel no no hace falta redundante!
    private String idModel;
    private String nombreAsig;
    private String creditos;
    private String dia;
    private String hora;

    public Model(){}

    public Model(String idModel, String nombreAsig, String creditos, String dia, String hora) {
        this.idModel = idModel;
        this.nombreAsig = nombreAsig;
        this.creditos = creditos;
        this.dia = dia;
        this.hora = hora;
    }

    private Model(Builder builder) {
        setIdModel(builder.idModel);
        setNombreAsig(builder.nombreAsig);
        setCreditos(builder.creditos);
        setDia(builder.dia);
        setHora(builder.hora);
    }

    public String getIdModel() {
        return idModel;
    }

    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
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

    /**
     * Devuelve un primer objeto sino, la primera vez tb lo crea.
     * @return Model
     */
    public Model createFirstModel(){
        Model model = Model.findById(Model.class, 0L);
           if(model == null) {
                model = new Builder()
                        .idModel("0")
                        .nombreAsig("Empatía")
                        .creditos("0")
                        .dia("0")
                        .hora("12/12/2012").build();
                model.save();
            }
        return model;
    }

    public static final class Builder {
        private String idModel;
        private String nombreAsig;
        private String creditos;
        private String dia;
        private String hora;

        public Builder() {
        }

        public Builder idModel(String val) {
            idModel = val;
            return this;
        }

        public Builder nombreAsig(String val) {
            nombreAsig = val;
            return this;
        }

        public Builder creditos(String val) {
            creditos = val;
            return this;
        }

        public Builder dia(String val) {
            dia = val;
            return this;
        }

        public Builder hora(String val) {
            hora = val;
            return this;
        }

        public Model build() {
            return new Model(this);
        }
    }
}
