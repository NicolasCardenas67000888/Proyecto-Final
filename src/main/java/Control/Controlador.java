/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Agenda;

import Modelo.Persona;
import Vista.Ventana;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mikev_6wadxan
 */
public class Controlador implements ActionListener {
    Agenda agenda;
    Ventana ven;

    public Controlador() {
        this.agenda = new Agenda();
        this.ven = new Ventana();
    }
public void iniciar(){
ven.getBtnAgregar().addActionListener(this);
ven.getBtnMostrar().addActionListener(this);
ven.setLocationRelativeTo(null);
ven.setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ven.getBtnAgregar())){
        
        Persona objP=new Persona(
        ven.getTxtnombre().getText(),
                ven.getTxtTelefono().getText(),
                ven.getTxtCorreo().getText());
        
      agenda.getListaC().add(objP);
      JOptionPane.showMessageDialog(ven, "Datos resgitrados...\n"+objP.toString());
        
        iniciarControles(ven.getJpnRegistro().getComponents());
        
        
        }
        
        if(e.getSource().equals(ven.getBtnMostrar())){
        iniciarTabla(ven.getTblContactos());   
        DefaultTableModel plantilla=(DefaultTableModel) ven.getTblContactos().getModel();
        for(Persona persona: agenda.getListaC()){
        plantilla.addRow(new Object[]{persona.getNom(),persona.getTel(),persona.getCorreo()});
        
        }
        }
            
    }
    
    public void iniciarControles(Component[] controles){
    for(Object control: controles){
    if(control instanceof JTextField){
    ((JTextField) control).setText("");
    }
    
    
    }
    
    }
    
    public void iniciarTabla(JTable tabla){
    DefaultTableModel plantilla=(DefaultTableModel)tabla.getModel();
    int tam=plantilla.getRowCount();
    for(int i=  tam-1;i>=0;i++){
    
    plantilla.removeRow(i);
    }
    
    }
    

    
    
}
