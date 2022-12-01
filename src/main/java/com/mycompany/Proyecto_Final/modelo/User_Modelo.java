/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Proyecto_Final.modelo;


import com.mycompany.Proyecto_Final.controlador.Controlador_Usuario;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas
 */
public class User_Modelo {
    
    public Controlador_Usuario user_control;
    
    public User_Modelo(Controlador_Usuario user_control  ){
        this.user_control = user_control;
    }
    public void guardar (ArrayList <String> datos ){
        FileWriter fw = null;
        boolean ex = false ;
            try {
                fw = new FileWriter("datos.csv", true);
                
            } catch (Exception e){
                ex = true ;
                JOptionPane.showMessageDialog(null, "No se ha podido crear el archivo");
            }
            
            if(!ex){
                try {
                    fw.write(datos.get(0) + ";" +datos.get(1) + ";"+ datos.get(2)+ ";" + datos.get(3) +  "\r\n");
                    JOptionPane.showMessageDialog(null, "Se guardo satisfactoriamente ");
                    limpiar();
                } catch (Exception e) {
                    ex=true;
                  JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo");

                }
                try {
                    fw.close();
                } catch (Exception e) {
                    ex =  true;
                 JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
                }
    }
}

    private void limpiar() {
        user_control.objUsuario.jtCedula.setText("");
        user_control.objUsuario.jtDireccion.setText("");
    }
    }
