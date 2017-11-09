package org.uab.android.ui.uiformexample;

import com.orm.SugarRecord;

/**
 * Created by dedam on 25/10/17.
 *
 *
 */

public class CourseRecord extends SugarRecord<CourseRecord>{
    private int idCourse;
    private String nombreAsig;
    private String credito;
    private String dia;
    private String hora;

    public CourseRecord() {
    }

    public CourseRecord(int idCourse, String nombreAsig, String credito, String dia, String hora) {
        this.idCourse = idCourse;
        this.nombreAsig = nombreAsig;
        this.credito = credito;
        this.dia = dia;
        this.hora = hora;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setId(int id) {
        this.idCourse = id;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
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
