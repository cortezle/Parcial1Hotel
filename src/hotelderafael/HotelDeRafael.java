/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.Scanner;

/**
 *
 * @author Lucho
 */
public class HotelDeRafael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // T ListaClientes lista = new ListaClientes();
        
        ListaClientes lista = new ListaClientes();
        int i = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("=== Menu ===\n"
                    + "1. Agregar\n"
                    + "2. Mostrar\n"
                    + "3. Buscar\n"
                    + "4. Eliminar\n"
                    + "opcion: ");
            i = entrada.nextInt();
            switch (i) {
                case 1:
                    lista.Agregar_Cliente();
                    break;
                case 2:
                    lista.Mostrar_Cliente();
                    break;
                case 3:
                    lista.Buscar_Cliente();
                    break;
                case -1:
                    System.out.println("Adios");
                    break;
                case 4:
                    lista.eliminar();
                    break;
                default:
                    System.out.println("Te equivocaste :(");
                    break;
            }
        } while (i != -1);
 
    
        ListaHabitacion listahab = new ListaHabitacion();
        int npiso=listahab.addpiso();
        int canth= listahab.agregarpisosyhabitacion(npiso);
        listahab.generar_habitaciones(canth, listahab);
       
        listahab.menu_habitacion(listahab);
 
 
        Menu m = new Menu();
        m.Opcion_Seleccionada();
        
    }

}
