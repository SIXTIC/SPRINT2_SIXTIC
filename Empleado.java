package com.SIXTIC.SIXTIC;
public class Empleado {

    /*PARAMETROS*/
    public String nombreEmpleado;
    public String correoEmpleado;
    public String empresaEmpleado;
    public String rollEmpleado;

    /*CONSTRUCTOR*/

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaEmpleado, String rollEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rollEmpleado = rollEmpleado;
    }

    /*GETTER Y SETTERS*/

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRollEmpleado() {
        return rollEmpleado;
    }

    public void setRollEmpleado(String rollEmpleado) {
        this.rollEmpleado = rollEmpleado;
    }
}
