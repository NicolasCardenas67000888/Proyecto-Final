/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Proyecto_Final.controlador;


import com.mycompany.Proyecto_Final.vista.Menu;
import com.mycompany.Proyecto_Final.vista.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Controlador_Menu implements WindowListener, ActionListener{
    public Menu mp ;
    public Controlador_Menu (Menu obj){
        mp = obj ;
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        salir ();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(mp, 
                "¿Desea salir de la aplicacion?" , "Comfirmacion",
                JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION)
            System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(mp.jbSalir)){
            salir();
        }
        if (e.getSource().equals(mp.jbUser)){
            Usuario usu = new Usuario(mp);
            mp.setVisible(false);
        }
    }
    
}
