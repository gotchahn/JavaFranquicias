/*
 * To change this template, choose Tools |\Templates
 * and open the template in the editor.
 */

package herenciafranquicia;

import GrupoJavaFood.*;

/**
 *
 * @author Carlos Gochez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UPCASTING
        Franquicia fb = new BurguerKing("BK Sta Monica");
        System.out.println("pagar: " + fb.calcularTotalFinal(100));
        ((BurguerKing)fb).setEsSocial(true);

        //----------------------------------------------------
        Franquicia restaurants[] = new Franquicia[3];
        restaurants[0] = new BurguerKing("BK Circunvalacion");
        
        restaurants[1] = new BarFriday("Galerias del Valle");
        //necesito hacer downcasting para set hora final y hora fin
        //1- Creando un objeto adicional de la clase deseada
        //=====>ClaseDeseada nombre = (ClaseDeseada)objetoaConvertir
        BarFriday bf =   (BarFriday)restaurants[1];
        bf.setHappyHour();

        restaurants[2] = new BurguerKing("Los Castanos");
        //necesito hacer de nuevo downcasting para llamar setEsSocial
        //2- Metodo DIreco ==> ((ClaseDeseada)objetoaConvertir)
        ((BurguerKing)restaurants[2]).setEsSocial(true);

        int cbks = 0, cbfs = 0;
        for(Franquicia f : restaurants){
            f.Imprimir();

            //contar de que tipo son
            if( f instanceof BurguerKing )
                cbks++;
            else if( f instanceof BarFriday )
                cbfs++;
        }

        System.out.println("\nHay " + cbks + " BKS y " + cbfs + " Bar Fridays");
    }

}
