/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

/**
 *
 * @author Sophi
 */
public class Reservacion {
    public Fecha Fecha_Ingreso, Fecha_Reservacion;
    public Cliente id_Cliente;
    public Paquete Paquete;
    public Habitacion Tipo_Habitacion;
    
    Reservacion(Fecha FechaI, Fecha FechaR, Cliente id, Paquete paquete, Habitacion tipo){
        setFechaIngreso(FechaI);
        setFechaReservacion(FechaR);
        setIdCliente(id);
        setPaquete(paquete);
        setTipoHabitacion(tipo);
    }
    
    public void setFechaIngreso(Fecha fecha){
        Fecha_Ingreso=fecha;
    }
    public void setFechaReservacion(Fecha fechaR){
        Fecha_Reservacion=fechaR;
    }
    public void setIdCliente(Cliente id){
        id_Cliente=id;
    }
    public void setPaquete(Paquete paquete){
        Paquete=paquete;
    }
    public void setTipoHabitacion(Habitacion tipo){
        Tipo_Habitacion=tipo;
    }
    
    public Fecha getFechaIngreso(){
        return Fecha_Ingreso;
    }
    public Fecha getFechaReservacion(){
        return Fecha_Reservacion;
    }
    public Cliente getIdCliente(){
        return id_Cliente;
    }
    public Paquete getPaquete(){
        return Paquete;
    }
    public Habitacion getTipoHabitacion(){
        return Tipo_Habitacion;        
    }
    
    
    
    
}
