/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Proyecto_Final.controlador;


import com.mycompany.Proyecto_Final.modelo.User_Modelo;
import com.mycompany.Proyecto_Final.vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Controlador_Usuario implements ActionListener{
    public Usuario objUsuario ;
    public User_Modelo user_model;

    public Controlador_Usuario(Usuario obj) {
        objUsuario = obj;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(objUsuario.jbGuardar)){
            /*System.out.println(objUsuario.jtCedula.getText());
            System.out.println(objUsuario.jtDireccion.getText());
            System.out.println(objUsuario.jcLoca.getSelectedItem().toString());
            System.out.println(objUsuario.jcTipodocu.getSelectedItem().toString());*/
            ArrayList<String> datos = new ArrayList<>();
            datos.add(objUsuario.jtCedula.getText());
            datos.add(objUsuario.jcTipodocu.getSelectedItem().toString());
            datos.add(objUsuario.jtDireccion.getText());
            datos.add(objUsuario.jcLoca.getSelectedItem().toString());
            user_model = new User_Modelo(this);
            user_model.guardar(datos);
            /*for (String item : datos) { //se prueba que guarde los datos
                System.out.println(item);
            }*/
        }
        if(e.getSource().equals(objUsuario.jbVolver)){
            volver();
        }
    }

    private void volver() {
        objUsuario.setVisible(false);
        objUsuario.dispose();
        objUsuario.mp.setVisible(true);
    }
    
}
