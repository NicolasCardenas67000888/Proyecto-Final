/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Proyecto_Final.vista;


import com.mycompany.Proyecto_Final.controlador.Controlador_Menu;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Usuario
 */
public class Menu extends JFrame {
    public JButton jbUser , jbSalir;
    Controlador_Menu mpc ;
    public Menu(){
     super ("Menu principal");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        mpc = new Controlador_Menu (this);
        addWindowListener(mpc);
        crearGUI ();
        setVisible(true);
    }
   private void crearGUI (){
       jbSalir = new JButton( "Salir");
       jbSalir.setBounds(50, 90, 200, 30);
       jbSalir.addActionListener(mpc);
       add(jbSalir);
       jbUser = new JButton( "Formulario");
       jbUser.setBounds(50, 40, 200, 30);
       jbUser.addActionListener(mpc);
       add(jbUser);
   }
}
