/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prueba2;

/**
 *
 * @author Carlos Gochez
 */
public class EmpleadoPorVentas extends Empleado {
    private char zona;
    private double ventas;

    public EmpleadoPorVentas(int c,String n,double s,char z){
        super(c,n,s);
        zona = z;
    }

    @Override
    public double getSalario(){
        double comis = 0;
        switch(zona){
            case 'a':
                comis = ventas * 0.05;
                break;
            case 'b':
                comis = ventas * 0.03;
                break;
            case 'c':
                comis = ventas * 0.01;
                break;
        }

        return salario + comis;
    }
}
