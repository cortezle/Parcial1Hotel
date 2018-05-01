/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotelderafael;

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
    
    
    

}
