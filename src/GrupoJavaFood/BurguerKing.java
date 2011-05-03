/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GrupoJavaFood;

/**
 *
 * @author Carlos Gochez
 */
public class BurguerKing extends Franquicia{

    public static String COMIDA = "Hamburgueras Americanas";
    private boolean esSocial;

    public BurguerKing(String n){
        super(n,COMIDA);
        esSocial = false;
    }
    
    public void setEsSocial(boolean activar){
        esSocial = activar;
    }
    
    public boolean getEsSocial(){
        return esSocial;
    }
    
    @Override
    public double calcularTotalFinal(double st){
        ganancia += st;
        return st;
    }

    @Override
    public void Imprimir(){
        System.out.println("Soy un BK en " + nombre +
                (getEsSocial() ? " soy social" : " No soy social"));
    }
    

}
