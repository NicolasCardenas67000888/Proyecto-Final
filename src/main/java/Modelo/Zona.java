/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author mikev_6wadxan
 */
public class Zona {
  private String direccion,localidad,daño;
  

    public Zona(String direccion, String localidad, String daño) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.daño = daño;
    }

        public Zona() {
        this.direccion = "";
        this.localidad = "";
        this.daño = "";
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDaño() {
        return daño;
    }

    public void setDaño(String daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "\nDireccion:" + direccion + "\nLocalidad=" + localidad + "\nTipo daño" + daño ;
    }
  
  
  
  
  
}
