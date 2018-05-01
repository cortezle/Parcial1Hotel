/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelderafael;
import java.util.Scanner;
/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Paquete {
    
    /**
     * En esta parte de codigo fue creada la clase Paquete en donde el administrador puede
     * seleccionar y dar detalles del paquete que se le va a ofrecer al cliente, el costo y
     * su descripcion, en el hotel hay dos tipos de paquete:
     * 
     * -Premium
     * -Basico.
     */
    
    //Atributos de paquete
    private String tipo_paquete;
    private String descripcion;
    private float costo;
    private float costo__extra_por_dia;

    //Constructor vacio
    public Paquete() {}
    //Constructor con parametros
    public Paquete(String tipo_paquete, String descripcion, float costo, float costo__extra_por_dia) {
        this.tipo_paquete = tipo_paquete;
        this.descripcion = descripcion;
        this.costo = costo;
        this.costo__extra_por_dia = costo__extra_por_dia;
    }

    //Setters & Getters
    public String getTipo_paquete() {
        return tipo_paquete;
    }

    public void setTipo_paquete(String tipo_paquete) {
        this.tipo_paquete = tipo_paquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCosto__extra_por_dia() {
        return costo__extra_por_dia;
    }

    public void setCosto__extra_por_dia(float costo__extra_por_dia) {
        this.costo__extra_por_dia = costo__extra_por_dia;
    }
    
    //  Se creo el metodo modificar
    public String modificar(){
        Scanner entrada = new Scanner(System.in);
        String description,Package;
        float cost, costo_dias_extra;
        int dias_extra,opcion,options;
        
        System.out.println("Que desea modificar?"
                + "1.Tipo de paquete\n"
                + "2.Dias Extra\n\n"
                + "Opcion:");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Que tipo de paquete sera?:\n");
                Package = entrada.nextLine();
                setTipo_paquete(Package);
                
                System.out.println("Cual es la nueva descripcion que desea agregarle?:\n");
                description = entrada.nextLine();
                setDescripcion(description);
                
                System.out.println("Cuanto sera el costo de este paquete?:\n");
                cost = entrada.nextFloat();
                setCosto(cost);
                
                System.out.println("Tendra dias extra?:\n"
                        + "1. Si\n"
                        + "2. No\n\n"
                        + "Opcion: ");
                options = entrada.nextInt();
                
                if (options == 1){
                    
                    System.out.println("Cuantos dias seran?\n");
                    dias_extra = entrada.nextInt();
                    costo_dias_extra = dias_extra*cost;
                    
                    System.out.println("Tu total seria: "+ costo_dias_extra);
                    System.out.println("\n");
                }
                else if(options == 2){
                    System.out.println("Ok, su costo total es: "+cost);
                }
                else{
                    System.out.println("Error");
                }
                break;
            case 2:
                System.out.println("Cuantos dias extra?\n");
                dias_extra = entrada.nextInt();
                setCosto__extra_por_dia(dias_extra*getCosto());
                
                System.out.println("Tu total sera de: $"+getCosto__extra_por_dia());
                break;
            default:
                System.out.println("Opcion incorrecta :(");
                break;
        }        
        
        return "El cambio se realizo con exito";
    }  

}
