/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class ListaClientes {
    /**
     * Clase ListaClientes donde contendra a todos los clientes que se registren
     * en el hotel.
     */
    
    //Se crea un ArrayList de tipo Cliente
    private ArrayList<Cliente> Lista_Clientes;

    //Constructor Inicializado
    public ListaClientes() {
        Lista_Clientes = new ArrayList<>();
    }
    //Metodo Agregar Cliente
    public void Agregar_Cliente() {

        Cliente p = new Cliente();
        Scanner entrada = new Scanner(System.in);
        String nombre, id, tarjeta;

        System.out.println("Nombre del Cliente: ");
        nombre = entrada.nextLine();
        p.setNombre(nombre);

        System.out.println("ID del Cliente: ");
        id = entrada.nextLine();
        p.setId_cliente(id);

        System.out.println("Tarjeta de Credito: ");
        tarjeta = entrada.nextLine();
        p.setTarjeta(tarjeta);

        Lista_Clientes.add(p);
    }
    //Metodo para mostrar los clientes de la lista
    public void Mostrar_Cliente() {
        for (Cliente e : Lista_Clientes) {
            System.out.println("=================================\n");
            System.out.println("Nombre: " + e.getNombre());
            System.out.println("ID: " + e.getId_cliente());
            System.out.println("Tarjeta de Credito: " + e.getTarjeta());
            System.out.println("=================================\n");
        }
    }
    //Metodo para encontrar a un cliente en especifico
    public void Buscar_Cliente(){
        String id;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el ID del cliente: ");
        id = entrada.nextLine();
        
        for(int i = 0; i<Lista_Clientes.size(); i++){
            if(Lista_Clientes.get(i).getId_cliente().equals(id)){
                System.out.println("=== Cliente encontrado ===\n");
                System.out.println("Nombre : "+Lista_Clientes.get(i).getNombre());
                System.out.println("ID: "+Lista_Clientes.get(i).getId_cliente());
                System.out.println("Tarjeta: "+Lista_Clientes.get(i).getTarjeta());
                break;
            }
            else{
                System.out.println("El cliente no se encuentra en el sistema");
            }
        }
        
    }
    //Metodo para eliminar a un cliente de la lista
    public void eliminar() {
        String id;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Escriba el ID del cliente: ");
        id = entrada.nextLine();
        
        for(int i = 0; i<Lista_Clientes.size(); i++){
            if(Lista_Clientes.get(i).getId_cliente().equals(id)){
                System.out.println("=== Cliente por ser eliminado ===\n");
                System.out.println("Nombre : "+Lista_Clientes.get(i).getNombre());
                System.out.println("ID: "+Lista_Clientes.get(i).getId_cliente());
                System.out.println("Tarjeta: "+Lista_Clientes.get(i).getTarjeta());
                
                System.out.println("Realmente desea eliminarlo? 1. Si, 2. No:\n");
                opcion = entrada.nextInt();
                if(opcion == 1){
                    System.out.println("Eliminando...");
                    Lista_Clientes.remove(i);
                }
                else{
                    System.out.println("Entonces no...");
                }
                
                break;
            }
            else{
                System.out.println("El cliente no se encuentra en el sistema...");
            }
        }        
    }
}
