/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author mikev_6wadxan
 */
public class Agenda {
    private ArrayList<Persona>ListaC;

    public Agenda(ArrayList<Persona> ListaC) {
        this.ListaC = ListaC;
        
        
    }
      public Agenda() {
        this.ListaC = new ArrayList<Persona>();
        
    }
      
          @Override
    public String toString() {
        String datos="";
        for(int i=0;i<ListaC.size();i++){
        datos+=ListaC.get(i).toString()+"\n";
        
        }
               
        return  "Lista Contactos=" + datos;
    }

    public ArrayList<Persona> getListaC() {
        return ListaC;
    }

    public void setListaC(ArrayList<Persona> ListaC) {
        this.ListaC = ListaC;
    }


      
}
