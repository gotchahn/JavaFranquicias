/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prueba2;

/**
 *
 * @author Carlos Gochez
 */
public class Empleado {
    protected int codigo;
    protected String nombre;
    protected double salario;

    public Empleado(int c,String n,double s){
        codigo = c;
        nombre = n;
        salario = s;
    }

    public double getSalario(){
        return salario;
    }
}
