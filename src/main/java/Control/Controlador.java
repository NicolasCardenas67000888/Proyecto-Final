/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Agenda;
import Modelo.Persona;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
        }
            
    }
    
    
}
