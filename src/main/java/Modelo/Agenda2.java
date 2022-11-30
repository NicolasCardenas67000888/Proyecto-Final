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
public class Agenda2 {
     private ArrayList<Zona>ListaB;
     public Agenda2(ArrayList<Zona>ListaB){
     this.ListaB=ListaB;
     }
     
          public Agenda2(){
     this.ListaB=new ArrayList<Zona>();
     }

    public ArrayList<Zona> getListaB() {
        return ListaB;
    }

    public void setListaB(ArrayList<Zona> ListaB) {
        this.ListaB = ListaB;
    }

    @Override
    public String toString() {
        return "Agenda2{" + "ListaB=" + ListaB + '}';
    }
     
     
}
