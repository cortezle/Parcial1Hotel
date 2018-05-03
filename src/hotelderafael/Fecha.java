/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.Calendar;

/**
 *
 * @author DanielLeonardo
 */
public class Fecha {
    private int year, month, date;

    public Fecha() {
    }
    
    public static void asignar_fecha(){
        // Instanciamos el objeto Calendar
        Calendar calendar = Calendar.getInstance();
        // Obtenemos el valor del año, mes y día.
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        
        System.out.println("AÑO ACTUAL: " + year);
        System.out.println("MES ACTUAL: " + (month+1));
        System.out.println("DÍA ACTUAL: " + date);       
                
        
    }
    
}
