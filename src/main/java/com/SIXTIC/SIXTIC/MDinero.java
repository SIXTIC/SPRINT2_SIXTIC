package com.SIXTIC.SIXTIC;

public class MDinero {

    /*PARAMETROS*/
    public int montoMovimiento;
    /*
    public double montoPositivo;
    public double montoNegativo;

     */
    public String conceptoMovimiento;
    public String usuarioMovimiento;

    /*CONSTRUCTOR*/

    public MDinero(int montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }

    /*GETTER Y SETTERS*/

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }


    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    /*METODO*/
    public boolean tipoConceptoPositivo() {
        if (montoMovimiento > 0) {
            System.out.print("Concepto de movimiento: Consignacion");
            return true;
        }
    else{
        return false;
        }
    }
    public boolean tipoConceptoNegativo(){
        if(montoMovimiento < 0){
            System.out.print("Concepto de movimiento: Retiro");
            return true;
        }
        else {
            return false;
        }
    }
}
