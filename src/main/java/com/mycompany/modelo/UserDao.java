/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class UserDao implements IDao {
    
    private File file = new File("C:\\Users\\Usuario\\Downloads\\uni\\Codigos ori\\Prueba");
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
    
   public UserDao() throws IOException {
        file.createNewFile();
        oos = new ObjectOutputStream(new FileOutputStream(file));
        ois = new ObjectInputStream(new FileInputStream(file));
    }

    @Override
    public String save(UserDto u) {
        File file = new File("C:\\Users\\Usuario\\Downloads\\uni\\Codigos ori\\Prueba");
        String salida = "Se ha guardado exitosamente";
        try {
            oos.writeObject(u);
        } catch (IOException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            salida = "se produjo un error";
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return salida;
    }

    @Override
    public String update(UserDto u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserDto getById(String id) {
  
        UserDto udtosalida = null;
        Object aux = null;
        try {
            aux = ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (aux != null) {
            if (aux instanceof UserDto) {
                if(((UserDto)aux).getUsuario().equals(id)){
                    udtosalida= (UserDto)aux;
                }
            }
            try {
                aux = ois.readObject();
            } catch (IOException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            ois.close();
        } catch (IOException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return udtosalida;
    }

    @Override
    public List<UserDto> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
