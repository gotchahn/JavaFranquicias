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
    }

}
