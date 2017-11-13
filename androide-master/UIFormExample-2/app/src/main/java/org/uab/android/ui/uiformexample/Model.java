package org.uab.android.ui.uiformexample;

import com.orm.SugarRecord;

/**
 * Created by zaotaobao on 11/11/17.
 */
public class Model extends SugarRecord {

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
    public void createFirstModel(){
       //he comentado el código me salta el siguiente error.
        // java.lang.NullPointerException: SugarContext has not been initialized properly. Call SugarContext.init(Context) in your Application.onCreate() method and SugarContext.terminate() in your Application.onTerminate() method.
        //modificando la version manifest parece solucionarse
          Model model1 = Model.findById(Model.class, 1L);
          Model model2 = Model.findById(Model.class, 2L);
          Model model3 = Model.findById(Model.class, 3L);


                 model1 = new Builder()
                        .idModel("1")
                        .nombreAsig("Masajes")
                        .creditos("9")
                        .dia("1")
                        .hora("12/12/2012").build();
                model1.save();

        model1 = new Builder()
                .idModel("2")
                .nombreAsig("Tantra")
                .creditos("9")
                .dia("1")
                .hora("12/12/2012").build();
        model1.save();

        model1 = new Builder()
                .idModel("3")
                .nombreAsig("Resistencia a la autoridad")
                .creditos("9")
                .dia("1")
                .hora("12/12/2012").build();
        model1.save();


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
