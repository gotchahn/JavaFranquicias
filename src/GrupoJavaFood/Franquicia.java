/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GrupoJavaFood;

import java.util.Date;

/**
 *
 * @author Carlos Gochez
 */
public class Franquicia {
    protected String nombre;
    protected Date inaugurado;
    protected boolean activo;
    protected double ganancia;
    protected String tipoComida;

    public Franquicia(String n,String tc){
        nombre = n;
        tipoComida = tc;
        inaugurado = new Date();
        activo = true;
        ganancia = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public Date getInaugurado(){
        return inaugurado;
    }

    public double getGanancia(){
        return ganancia;
    }

    public boolean isActivo(){
        return activo;
    }

    public void setTipoComida(String tc){
        tipoComida = tc;
    }

    public String getTipoComida(){
        return tipoComida;
    }

    /**
     * Imprimi el detalle basico de la Franquicia
     */
    public void Imprimir(){
        System.out.println("El nombre de la franquicia es: " +
                nombre + " Inaugurado en " +
                inaugurado.toString() + " tipo de comida: " +
                tipoComida);
    }

    /**
     * Esta funcion retorna un total a pagar en base a
     * un subtotal enviado de parametro, ademas esta funcion
     * actualiza la ganancia de la franquicia
     * @param st => Subtotal generado
     * @return Retorna el monto final generado
     */
    public double calcularTotalFinal(double st){
        double tp = st + (st * 0.12);
        ganancia += tp;
        return tp;
    }
}
