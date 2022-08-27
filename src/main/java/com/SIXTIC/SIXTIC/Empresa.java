package com.SIXTIC.SIXTIC;

import java.util.Scanner;


public class Empresa {

    /*PARAMETROS*/
    public String nombreEmpresa,direccionEmpresa,telefonoEmpresa, NIT;

    /*CONSTRUCTOR*/

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String NIT) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NIT = NIT;
    }

    /*getter y setter*/

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

}
