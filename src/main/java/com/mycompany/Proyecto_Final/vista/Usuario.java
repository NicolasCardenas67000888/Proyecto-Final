/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Proyecto_Final.vista;


import com.mycompany.Proyecto_Final.controlador.Controlador_Usuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Usuario extends JFrame {
    public JTextField jtCedula , jtDireccion ;
    public JRadioButton jrActivo , jrInactivo;
    public JButton jbGuardar , jbVolver;
    public JComboBox <String> jcTipodocu,jcLoca;
    public Menu mp;
    public Controlador_Usuario controlador_usu;
    
    public Usuario(Menu mp){
        super ("Formulario");
        this.mp = mp;
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLayout(null);
        crearGUI();
        setVisible(true);
    }

   

    private void crearGUI() {
        JLabel jl = new JLabel ("Datos de informa APP");
        jl.setBounds(0,0,600,50);
        jl.setOpaque(true);
        jl.setBackground(Color.RED);
        jl.setForeground(Color.ORANGE);
        jl.setFont(new Font("Tahoma", Font.BOLD,25));
        add (jl);
        JLabel jlCedula = new JLabel ("Numero de documento: ");
        jlCedula.setBounds(30, 60, 150, 25);
        add(jlCedula);
        jtCedula = new JTextField();
        jtCedula.setBounds(180, 60, 120, 25);
        add (jtCedula);
        JLabel jlTipodocu = new JLabel ("Seleccione el tipo de documento: ");
        jlTipodocu.setBounds(30, 90, 220, 25);
        add(jlTipodocu);
        jcTipodocu = new JComboBox<>();
        jcTipodocu.addItem("Cedula de ciuadadnia");
        jcTipodocu.addItem("Pasaporte");
        jcTipodocu.addItem("Permiso de permanencia");
        jcTipodocu.addItem("Otro");
        jcTipodocu.setBounds(230, 90, 180, 25);
        add(jcTipodocu);
        JLabel jlDire = new JLabel ("Ingrese la direccion del daño: ");
        jlDire.setBounds(30, 120, 220, 25);
        add(jlDire);
        jtDireccion =  new JTextField();
        jtDireccion.setBounds(200,120 , 200, 25);
        add(jtDireccion);
        JLabel jlLoca = new JLabel ("Ingrese la localidad donde esta el daño: ");
        jlLoca.setBounds(30, 150, 300, 25);
        add(jlLoca);
        jcLoca = new JComboBox<>();
        jcLoca.addItem("Suba");
        jcLoca.addItem("Bosa");
        jcLoca.addItem("Teusaquillo");
        jcLoca.addItem("Kennedy");
        jcLoca.setBounds(260, 150, 150, 25);
        add(jcLoca);
        controlador_usu = new Controlador_Usuario (this);
        jbGuardar =  new JButton ("Guardar");
        jbGuardar.setBounds(30, 220, 100, 25);
        jbGuardar.addActionListener(controlador_usu);
        add(jbGuardar);
        jbVolver =  new JButton ("Volver");
        jbVolver.setBounds(140, 220, 100, 25);
        jbVolver.addActionListener(controlador_usu);
        add(jbVolver);
        
    }
}
