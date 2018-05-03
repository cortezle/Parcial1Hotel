/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;

import java.util.HashMap;

/**
 *
 * @author Lucho
 */
public class Habitacion {
  private String npiso;
    private double precio;
    private String estado;
    private String tipo;
    private int nombre;

    public Habitacion() {
    }

    public Habitacion(String npiso, double precio, String estado, String tipo, int nombre) {
        this.npiso = npiso;
        this.precio = precio;
        this.estado = estado;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getNpiso() {
        return npiso;
    }

    public void setNpiso(String npiso) {
        this.npiso = npiso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
   
    
}
    

