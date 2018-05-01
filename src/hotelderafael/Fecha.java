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
    private Calendar dia, mes, annio;

    public Fecha(Calendar dia, Calendar mes, Calendar annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public Calendar getDia() {
        return dia;
    }

    public Calendar getMes() {
        return mes;
    }

    public Calendar getAnnio() {
        return annio;
    }
    
   
    
}
