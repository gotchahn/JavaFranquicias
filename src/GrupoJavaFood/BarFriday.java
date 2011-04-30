/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GrupoJavaFood;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gotcha
 */
public class BarFriday extends Franquicia{
    
    private Date hhInit;
    private Date hhFinish;
    
    public BarFriday(String n){
        super(n,"Comida y bebida a la carte");
        hhInit = null;
        hhFinish = null;
    }
    
    public void setHappyHour(){
        Calendar c = Calendar.getInstance();
        c.set(2011,(4-1),28);
        //pasar a init
        hhInit = c.getTime();
        //pasar a finish
        c.set(2011,(5-1),28);
        hhFinish = c.getTime();
    }
    
    @Override
    public double calcularTotalFinal(double st){
        double monto=0;
        boolean aplicoHH = false;
        
        if(  hhInit != null && hhFinish != null ){
            Date now = new Date();
            
            if( now.getTime() >= hhInit.getTime() &&
                now.getTime() <= hhFinish.getTime()){
                monto = st * 0.12 * 0.1;
                aplicoHH = true;
            }
        }
        
        if( !aplicoHH )
            monto = st * 0.12 * 0.1 * 0.15;
        
        ganancia += monto + st;
        return monto + st;
    }
    
}


