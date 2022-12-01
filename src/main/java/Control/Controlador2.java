/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Agenda2;
import Modelo.Zona;
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
public class Controlador2 implements ActionListener  {
    Agenda2 agenda2;
    Ventana ven2;

    public Controlador2() {
        this.agenda2 = new Agenda2();
        this.ven2 = new Ventana();
        
    }
public void iniciar2(){
ven2.getBtnAgregar2().addActionListener(this);
ven2.getBtnMostrar2().addActionListener(this);
ven2.setLocationRelativeTo(null);
ven2.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(ven2.getBtnAgregar2())){
            Zona objZ=new Zona (
        ven2.getTxtDireccion().getText(),
        ven2.getTxtLocalidad().getText(),
        ven2.getTxtTipodaño().getText());
        agenda2.getListaB().add(objZ);
        JOptionPane.showMessageDialog(ven2,"Datos registrados..\n"+objZ.toString());
        
        iniciarControles2(ven2.getjPnRegistro2().getComponents());
        
        }
        
        if(e.getSource().equals(ven2.getBtnMostrar2())){
            iniciarTabla2(ven2.getTblTabla2());
        DefaultTableModel plantilla2=(DefaultTableModel)ven2.getTblTabla2().getModel();
        for(Zona zona:agenda2.getListaB()){
        plantilla2.addRow(new Object[]{zona.getDireccion(),zona.getLocalidad(),zona.getDaño()});
        
        }
        
        }
    }
    
    public void iniciarControles2(Component[] controles2){
    for(Object control2: controles2 ){
    if(control2 instanceof JTextField){
    ((JTextField)control2).setText("");
    }
    
    
    }
    }
    
    public void iniciarTabla2(JTable tabla2){
    DefaultTableModel plantilla2=(DefaultTableModel)ven2.getTblTabla2().getModel();
    int tam2=plantilla2.getRowCount();
    for(int i=tam2-1;i>=0;i++){
    plantilla2.removeRow(i);
    }
    }
}
