/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofina;

import Control.Controlador;
import Control.Controlador2;
import Vista.Ventana;


/**
 *
 * @author mikev_6wadxan
 */
public class ProyectoFina {
int a;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      Control.Controlador objC=new Controlador();
      objC.iniciar();
      Control.Controlador2 objD=new Controlador2();
      objD.iniciar2();
      

      
    }
    public static void main2(String[]args){
    Control.Controlador2 objD=new Controlador2();
      objD.iniciar2();
    }
}
