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
        String datos2="";
        for(int i=0;i<ListaB.size();i++){
        datos2+=ListaB.get(i).toString()+"\n";
        }
        return   "Lista Zona dañada=" + datos2;
    }
     
     
}
