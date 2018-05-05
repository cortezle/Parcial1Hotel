/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.Scanner;

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
    
 public void mostrarReservacion(Cliente id, Reservacion reservaciones[]){
        int i=0;
        while((reservaciones[i].id_Cliente)!=id){
            if((reservaciones[i].id_Cliente)==id){
                System.out.print("\n Fecha de ingreso: "+reservaciones[i].Fecha_Ingreso+"\n Fecha de reservacion: "+reservaciones[i].Fecha_Reservacion+
                        "\n DUI: "+reservaciones[i].id_Cliente+"\n Paquete seleccionado: "+reservaciones[i].Paquete+"\n Tipo de habitacion: "+reservaciones[i].Tipo_Habitacion);
                
            }
            else
                i=i+1;            
        }
    }
    public void verificarReservacion(Cliente id, Reservacion reservaciones[]){
        int i=0;
        while((reservaciones[i].id_Cliente)!=id){
            if((reservaciones[i].id_Cliente)==id){
                System.out.print("\n Fecha de ingreso: "+reservaciones[i].Fecha_Ingreso+"\n Fecha de reservacion: "+reservaciones[i].Fecha_Reservacion+
                        "\n DUI: "+reservaciones[i].id_Cliente+"\n Paquete seleccionado: "+reservaciones[i].Paquete+"\n Tipo de habitacion: "+reservaciones[i].Tipo_Habitacion);
                
            }
            else{
                i=i+1;
                if(i==500){
                    System.out.println("Reservacion no encontrada");
                    break;
                }                  
            }
        }    
    }
    /*public void agregarReservacion(){
        
    }
    public void modificarReservacion(Cliente id, Reservacion reservaciones[]){
        int i=0, n=0;
        while((reservaciones[i].id_Cliente)!=id){
            if((reservaciones[i].id_Cliente)==id){
                System.out.println("=== ¿Que dato desea modificar ===\n"
                    + "1. Fecha de ingreso\n"
                    + "2. Fecha de Reservacion\n"
                    + "3. DUI del cliente\n"
                    + "4. Paquete\n"+
                        "5. Tipo de Habitacion"
                    + "opcion: ");
                Scanner entrada = new Scanner(System.in);
                n = entrada.nextInt();
                switch (n) {
                    case 1:
                        reservaciones[i].Fecha_Ingreso=setFechaIngreso();         
                        break;
                    case 2:
                        reservaciones[i].Fecha_Reservacion=setFechaReservacion();
                        break;
                    case 3:
                        reservaciones[i].id_Cliente=setIdCliente();
                        break;
                    case -1:
                        System.out.println("Adios");
                        break;
                    case 4:
                        reservaciones[i].Paquete=setPaquete();
                        break;
                    case 5:
                        reservaciones[i].Tipo_Habitacion=setTipoHabitacion();
                        break;
                    default:
                        System.out.println("Te equivocaste :(");
                        break;
                }
            }
            else
                i=i+1;            
        }
        
    }*/
}