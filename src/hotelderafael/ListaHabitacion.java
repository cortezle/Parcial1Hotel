/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class ListaHabitacion {
     private ArrayList<Habitacion> habitaciones;
    private int i = 1;

    public ListaHabitacion() {
        habitaciones = new ArrayList<>();
    }

    public void addhabitacion() {
        Habitacion habitacion = new Habitacion();
        //habitaciones.add(habitacion);
       
            habitacion.setEstado("Disponible");
            habitacion.setNombre(i++);
            habitacion.setNpiso("a");
            habitacion.setPrecio(30);
        
       

        //condicion acerca de una habitacion doble o sencilla
        if (habitacion.getNombre() % 2 == 0) {
            habitacion.setTipo("doble");
        } else {
            habitacion.setTipo("Sencilla");
        }
        
        habitaciones.add(habitacion);

    }

    public int addpiso() {
        Scanner leer = new Scanner(System.in);
        int cantpisos;
        System.out.println("Cuantos pisos tiene su hotel de 10 habitaciones?");
        cantpisos = leer.nextInt();
        return cantpisos;
    }

    public int agregarpisosyhabitacion(int cantpisos) {
        int canthab = cantpisos * 10;
        return canthab;
    }
    public void generar_habitaciones(int canthab,ListaHabitacion lista){
                for (int i = 0; i < canthab; i++) {
                    lista.addhabitacion();
                    
        }
    }
   public void Mostrar_Habitacion() {
        for (Habitacion e : habitaciones) {
            System.out.println("=================================\n");
            System.out.println(e.getNombre());
            System.out.println( e.getEstado());
            System.out.println(  e.getNpiso());
            System.out.println(  e.getPrecio());
            System.out.println(  e.getTipo());
            System.out.println("=================================\n");
        }
    }
   
       public void Buscar_Habitacion(){
        String id;
        for(int i = 0; i<habitaciones.size(); i++){
            if(habitaciones.get(i).getEstado().equals("Disponible")){
                System.out.println("=== Habitacion encontrada ===\n");
                System.out.println("=================================\n");
                System.out.println("Numero de habitacion "+habitaciones.get(i).getNpiso()+habitaciones.get(i).getNombre());
                System.out.println("Estado de la habitacion " +habitaciones.get(i).getEstado());
                System.out.println("Precio $" + habitaciones.get(i).getPrecio());
                System.out.println("Tipo de habitacion "+habitaciones.get(i).getTipo());
                System.out.println("=================================\n");
                break;
            }
            else{
                System.out.println("lo siento todas las habitaciones estan ocupadas");
            }
        }
        
    }
       public void menu_habitacion(ListaHabitacion lista){
       
        int l = 0;
        Scanner entrada = new Scanner(System.in);
        

        do {
            System.out.println("=== Menu ===\n"
                    + "1. Mostrar\n"
                    + "2. Buscar\n"
                    + "opcion: ");
            l = entrada.nextInt();
            switch (l) {
                case 1:
                    System.out.println("case1");
                    lista.Mostrar_Habitacion();
                    break;
                case 2:
                    System.out.println("case 2");
                    lista.Buscar_Habitacion();
                    break;
                default:
                    System.out.println("Te equivocaste :(");
                    break;
            }
        } while (l != -1);

}
}
